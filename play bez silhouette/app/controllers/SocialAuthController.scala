package controllers

import javax.inject.Inject

import javax.inject.Inject
import com.mohiva.play.silhouette.api._
import com.mohiva.play.silhouette.api.exceptions.ProviderException
import com.mohiva.play.silhouette.api.repositories.AuthInfoRepository
import com.mohiva.play.silhouette.impl.providers._
import daos.RegisteredUserDAO
import models.RegisteredUser
import daos.CategoriesDAO
import models.Categories
import daos.UsersDAO
import models.Users
import models.services.UserService
import play.api.cache.CacheApi
import play.api.i18n.{ I18nSupport, Messages, MessagesApi }
import play.api.libs.json.Json
import play.api.mvc._
import utils.auth.DefaultEnv
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.language.postfixOps

/**
 * The social auth controller.
 *
 * @param messagesApi The Play messages API.
 * @param silhouette The Silhouette stack.
 * @param userService The user service implementation.
 * @param authInfoRepository The auth info service implementation.
 * @param socialProviderRegistry The social provider registry.
 */
class SocialAuthController @Inject() (
  val messagesApi: MessagesApi,
  silhouette: Silhouette[DefaultEnv],
  userService: UserService,
  authInfoRepository: AuthInfoRepository,
  socialProviderRegistry: SocialProviderRegistry,
  cache: CacheApi,
  registeredUserDAO: RegisteredUserDAO,
  usersDAO: UsersDAO
)
    extends Controller with I18nSupport with Logger {

  /**
   * Authenticates a user against a social provider.
   *
   * @param provider The ID of the provider to authenticate against.
   * @return The result to display.
   */
  def authenticate(provider: String): Action[AnyContent] = Action.async { r =>
    cacheAuthTokenForOauth1(r) { implicit request =>
      (socialProviderRegistry.get[SocialProvider](provider) match {
        case Some(p: SocialProvider with CommonSocialProfileBuilder) =>
          p.authenticate().flatMap {
            case Left(result) => Future.successful(result)
            case Right(authInfo) => for {
              profile <- p.retrieveProfile(authInfo)
              user <- userService.save(profile)
              _ <- authInfoRepository.save(profile.loginInfo, authInfo)
              authenticator <- silhouette.env.authenticatorService.create(profile.loginInfo)
              _ <- silhouette.env.authenticatorService.init(authenticator)

            } yield {
              val registeredUser: RegisteredUser = RegisteredUser(id = 0, userId = user.loginInfo.providerKey, provider = user.loginInfo.providerID,
                firstName = user.firstName.get, lastName = user.lastName.get, fullName = user.fullName.get, email = user.email.get, avatarImg = user.avatarURL.get)

              val u = Users(id = 0, userId = user.loginInfo.providerKey, firstName = user.firstName.get, lastName = user.lastName.get, email = user.email.get, provider = user.loginInfo.providerID)
              usersDAO.insert(u)

              silhouette.env.eventBus.publish(LoginEvent(user, request))
              /*
              usersDAO.one(user.firstName.get) map {
                usr => Ok(Json.toJson(usr))
              }*/

              val strUser = Json.obj("user" -> user) + ""
              val test = user.loginInfo.providerKey

              // Redirect("http://localhost:4200/logged?auth=" + registeredUser.userId, 302).withSession("user" -> strUser)
              Redirect("http://localhost:4200/logged?auth=" + registeredUser.userId, 302).withSession("user" -> strUser)

            }
          }
        //  case _ => Future.failed(new ProviderException(s"Cannot authenticate with unexpected social provider $provider"))
      }).recover {
        case e: ProviderException =>
          logger.error("Unexpected provider error", e)
          Unauthorized(Json.obj("message" -> Messages("could.not.authenticate")))
      }
    }
  }

  def authenticate2(provider: String) = Action.async { implicit request =>
    (socialProviderRegistry.get[SocialProvider](provider) match {
      case Some(p: SocialProvider with CommonSocialProfileBuilder) =>
        p.authenticate().flatMap {
          case Left(result) => Future.successful(result)
          case Right(authInfo) => for {
            profile <- p.retrieveProfile(authInfo)
            user <- userService.save(profile)
            authInfo <- authInfoRepository.save(profile.loginInfo, authInfo)
            authenticator <- silhouette.env.authenticatorService.create(profile.loginInfo)
            value <- silhouette.env.authenticatorService.init(authenticator)
            //  result <- silhouette.env.authenticatorService.embed(value, Redirect(routes.ApplicationController.index()))
          } yield {
            silhouette.env.eventBus.publish(LoginEvent(user, request))
            // result

            var u = Users(id = 0, userId = user.loginInfo.providerKey, firstName = user.firstName.get, lastName = user.lastName.get, email = user.email.get, provider = user.loginInfo.providerID)
            usersDAO.insert(u)

            Ok

          }
        }
      case _ => Future.failed(new ProviderException(s"Cannot authenticate with unexpected social provider $provider"))
    }).recover {
      case e: ProviderException =>
        logger.error("Unexpected provider error", e)
        Unauthorized(Json.obj("message" -> Messages("could.not.authenticate")))
    }
  }
  /*
  def getLoggedUser: Action[AnyContent] = Action.async { implicit request =>
    var userId = "unknown"
    request.session.get("user").foreach { user =>
      {
        val userId1 = user.split("providerKey\":\"").last
        val userId2 = userId1.split("\"},\"firstName").head
        userId = userId2
      }
    }
    registeredUserDAO.getByUserId(userId) map {
      usr => Ok(Json.toJson(usr))
    }
  }
  */
  def logoutUser = Action { implicit request =>
    Ok("Bye").withNewSession
  }

  def getLoggedUser: Action[AnyContent] = Action.async { implicit request =>
    var userId = "unknown"
    request.session.get("user").foreach { user =>
      {
        val userId1 = user.split("providerKey\":\"").last
        val userId2 = userId1.split("\"},\"firstName").head
        userId = userId2
      }
    }
    usersDAO.one(userId) map {
      usr => Ok(Json.toJson(usr))
    }
  }

  def u = Action.async { implicit request =>
    val x = "asd"
    usersDAO.one(x) map {
      u => Ok(Json.toJson(u))
    }
  }
  /**
   * Satellizer executes multiple requests to the same application endpoints for OAuth1.
   *
   * So this function caches the response from the OAuth provider and returns it on the second
   * request. Not nice, but it works as a temporary workaround until the bug is fixed.
   *
   * @param request The current request.
   * @param f The action to execute.
   * @return A result.
   * @see https://github.com/sahat/satellizer/issues/287
   */
  private def cacheAuthTokenForOauth1(request: Request[AnyContent])(f: Request[AnyContent] => Future[Result]): Future[Result] = {
    request.getQueryString("oauth_token") -> request.getQueryString("oauth_verifier") match {
      case (Some(token), Some(verifier)) => cache.get[Result](token + "-" + verifier) match {
        case Some(result) => Future.successful(result)
        case None => f(request).map { result =>
          cache.set(token + "-" + verifier, result, 1 minute)
          result
        }
      }
      case _ => f(request)
    }
  }
}
