package daos

import javax.inject.Inject

import models.{ Users, UsersREST }
import play.api.db.slick.{ DatabaseConfigProvider, HasDatabaseConfigProvider }
import slick.driver.JdbcProfile
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ ExecutionContext, Future }

class UsersDAO @Inject() (protected val dbConfigProvider: DatabaseConfigProvider)
    extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  val Users = TableQuery[UsersTable]

  def all(implicit ec: ExecutionContext): Future[List[UsersREST]] = {
    val query = Users
    val results = query.result
    val futureUsers = db.run(results)
    futureUsers.map(
      _.map {
      a => UsersREST(id = a.id, userId = a.userId, firstName = a.firstName, lastName = a.lastName, email = a.email, provider = a.provider)
    }.toList
    )
  }

  def one(userId: String): Future[Option[UsersREST]] = {
    val futureUser = db.run(Users.filter(_.userId === userId).result.headOption)
    futureUser.map(
      _.map {
        a => UsersREST(id = a.id, userId = a.userId, firstName = a.firstName, lastName = a.lastName, email = a.email, provider = a.provider)
      }
    )
  }

  def insert(user: Users): Future[Unit] = db.run(Users += user).map { _ => () }

  def remove(id: Int): Future[Unit] = db.run(Users.filter(_.id === id).delete).map { _ => () }

  class UsersTable(tag: Tag) extends Table[Users](tag, "USERS") {
    def id = column[Int]("ID", O.AutoInc, O.AutoInc)
    def userId = column[String]("USERID")
    def firstName = column[String]("FIRSTNAME")
    def lastName = column[String]("LASTNAME")
    def email = column[String]("EMAIL")
    def provider = column[String]("PROVIDER")
    def * = (id, userId, firstName, lastName, email, provider) <> (models.Users.tupled, models.Users.unapply)
  }

}
