package models

import java.sql.Timestamp

import play.api.libs.json.Format

/**
 * Created by kprzystalski on 23/04/17.
 */

case class Products(title: String, author: String, description: String, pid: Int, gid: Int, price: Int)
case class Categories(gid: Int, genre: String)
case class Users(id: Int, userId: String, firstName: String, lastName: String, email: String, provider: String)
case class Order(oid: Int, productlist: String, shipment: String, payment: String, price: Int, uid: String, address: String)
case class Cart(title: String, price: Int, uid: String)
case class Test(t: Int)
case class Parcels(oid: Int, productlist: String, shipment: String, payment: String, price: Int, uid: String, address: String)
case class RegisteredUser(id: Int, userId: String, provider: String, firstName: String, lastName: String, fullName: String, email: String, avatarImg: String)