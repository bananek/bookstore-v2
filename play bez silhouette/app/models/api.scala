package models

import play.api.libs.json.{ Json, OFormat }

/**
 * Created by kprzystalski on 23/04/17.
 */

case class ProductsREST(title: String, author: String, description: String, pid: Int, gid: Int, price: Int)
case class CategoriesREST(gid: Int, genre: String)
case class OrderREST(oid: Int, productlist: String, shipment: String, payment: String, price: Int, uid: String, address: String)
case class CartREST(title: String, price: Int, uid: String)
case class TestREST(t: Int)
case class ParcelsREST(oid: Int, productlist: String, shipment: String, payment: String, price: Int, uid: String, address: String)
case class UsersREST(id: Int, userId: String, firstName: String, lastName: String, email: String, provider: String)

object ProductsREST {
  implicit val productsFormat = Json.format[ProductsREST]
}

object CategoriesREST {
  implicit val categoriesFormat = Json.format[CategoriesREST]
}

object UsersREST {
  implicit val usersFormat = Json.format[UsersREST]
}

object OrderREST {
  implicit val orderFormat = Json.format[OrderREST]
}

object CartREST {
  implicit val cartFormat = Json.format[CartREST]
}

object TestREST {
  implicit var testFormat = Json.format[TestREST]
}

object ParcelsREST {
  implicit var parcelsFormat = Json.format[ParcelsREST]
}

case class RegisteredUserREST(id: Int, userId: String, provider: String, firstName: String, lastName: String, fullName: String, email: String, avatarImg: String)

/*
object RegisteredUserREST {
  implicit val productFormat: OFormat[RegisteredUserREST] = Json.format[RegisteredUserREST]
}

*/

object RegisteredUserREST {
  implicit var registeredUserFormat = Json.format[RegisteredUserREST]
}
