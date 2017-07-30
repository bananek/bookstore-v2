package controllers

import javax.inject.Inject
import daos.RegisteredUserDAO
import play.api.libs.json.Json
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import daos.UsersDAO

class UserController @Inject() (registeredUserDAO: RegisteredUserDAO, usersDAO: UsersDAO) extends Controller {

  def getAll: Action[AnyContent] = Action.async { implicit request =>
    registeredUserDAO.all map {
      user => Ok(Json.toJson(user))
    }
  }
  def getByUserId(userId: String): Action[AnyContent] = Action.async {
    implicit request =>
      usersDAO.one(userId) map {
        usr => Ok(Json.toJson(usr))
      }
  }
  /*
  def getByUserId(userId: String): Action[AnyContent] = Action.async {
    implicit request =>
      registeredUserDAO.getByUserId(userId) map {
        usr => Ok(Json.toJson(usr))
      }
  }*/

}
