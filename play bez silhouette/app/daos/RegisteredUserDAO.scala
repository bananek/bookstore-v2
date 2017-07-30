package daos

import javax.inject.Inject
import models._
import play.api.db.slick.{ DatabaseConfigProvider, HasDatabaseConfigProvider }
import slick.driver.JdbcProfile
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ ExecutionContext, Future }

class RegisteredUserDAO @Inject() (protected val dbConfigProvider: DatabaseConfigProvider)
    extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._
  val RegisteredUsers: TableQuery[RegisteredUsersTable] = TableQuery[RegisteredUsersTable]

  def all(implicit ec: ExecutionContext): Future[List[RegisteredUserREST]] = {
    db.run(RegisteredUsers.result) map (
      _.map {
        a => RegisteredUserREST(id = a.id, userId = a.userId, provider = a.provider, firstName = a.firstName, lastName = a.lastName, fullName = a.fullName, email = a.email, avatarImg = a.avatarImg)
      }.toList
    )
  }

  def getByUserId(userId: String): Future[List[RegisteredUserREST]] = {
    db.run(RegisteredUsers.filter(_.userId === userId).result.headOption) map (
      _.map {
        a => RegisteredUserREST(id = a.id, userId = a.userId, provider = a.provider, firstName = a.firstName, lastName = a.lastName, fullName = a.fullName, email = a.email, avatarImg = a.avatarImg)
      }.toList
    )
  }

  def insert(registeredUser: RegisteredUser): Future[RegisteredUserREST] = {

    val insertQuery = RegisteredUsers returning RegisteredUsers.map(_.id) into ((registeredUser, id) => registeredUser.copy(id = id))
    val action = insertQuery += registeredUser
    val dbAc = db.run(action)
    dbAc.map(a => RegisteredUserREST(id = a.id, userId = a.userId, provider = a.provider, firstName = a.firstName, lastName = a.lastName, fullName = a.fullName, email = a.email, avatarImg = a.avatarImg))
  }

  def insert2(regusr: RegisteredUser): Future[Unit] = db.run(RegisteredUsers += regusr).map { _ => () }

  def remove(id: Int): Future[Unit] = db.run(RegisteredUsers.filter(_.id === id).delete).map { _ => () }

  class RegisteredUsersTable(tag: Tag) extends Table[RegisteredUser](tag, "REGISTEREDUSER") {
    def id: Rep[Int] = column[Int]("id", O.PrimaryKey, O.AutoInc, O.AutoInc)
    def userId: Rep[String] = column[String]("userId")
    def provider: Rep[String] = column[String]("provider")
    def firstName: Rep[String] = column[String]("firstName")
    def lastName: Rep[String] = column[String]("lastName")
    def fullName: Rep[String] = column[String]("fullName")
    def email: Rep[String] = column[String]("email")
    def avatarImg: Rep[String] = column[String]("avatarImg")

    def * = (id, userId, provider, firstName, lastName, fullName, email, avatarImg) <> (models.RegisteredUser.tupled, models.RegisteredUser.unapply)
  }

}
