
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/BanaN/Desktop/sil/play bez silhouette/conf/routes
// @DATE:Sun Jul 30 02:36:38 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: javax.inject.Provider[controllers.Application],
  // @LINE:44
  UserController_0: javax.inject.Provider[controllers.UserController],
  // @LINE:45
  SocialAuthController_3: controllers.SocialAuthController,
  // @LINE:46
  SocialAuthController_1: javax.inject.Provider[controllers.SocialAuthController],
  // @LINE:55
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: javax.inject.Provider[controllers.Application],
    // @LINE:44
    UserController_0: javax.inject.Provider[controllers.UserController],
    // @LINE:45
    SocialAuthController_3: controllers.SocialAuthController,
    // @LINE:46
    SocialAuthController_1: javax.inject.Provider[controllers.SocialAuthController],
    // @LINE:55
    Assets_2: controllers.Assets
  ) = this(errorHandler, Application_4, UserController_0, SocialAuthController_3, SocialAuthController_1, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, UserController_0, SocialAuthController_3, SocialAuthController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """browse""", """@controllers.Application@.browse"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product""", """@controllers.Application@.product(id:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """@controllers.Application@.categories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """@controllers.Application@.category(id:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getcategory""", """@controllers.Application@.getcat(id:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """@controllers.Application@.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showorders""", """@controllers.Application@.showorders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pbrowse""", """@controllers.Application@.pbrowse"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newparcel""", """@controllers.Application@.newparcel"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newproduct""", """@controllers.Application@.newproduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendorder""", """@controllers.Application@.sendorder"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addtocart""", """@controllers.Application@.addtocart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newcategory""", """@controllers.Application@.newcategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removefromcart/""" + "$" + """title<[^/]+>""", """@controllers.Application@.removefromcart(title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeproduct/""" + "$" + """pid<[^/]+>""", """@controllers.Application@.removeproduct(pid:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removecategory/""" + "$" + """gid<[^/]+>""", """@controllers.Application@.removecategory(gid:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeorder/""" + "$" + """oid<[^/]+>""", """@controllers.Application@.removeorder(oid:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeparcel/""" + "$" + """oid<[^/]+>""", """@controllers.Application@.removeparcel(oid:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeuser/""" + "$" + """id<[^/]+>""", """@controllers.Application@.removeuser(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showtest""", """@controllers.Application@.showtest"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removetest""", """@controllers.Application@.removetest(t:Int ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newtest""", """@controllers.Application@.newtest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registereduser""", """@controllers.Application@.gu"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """@controllers.UserController@.getByUserId(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getLoggedUser""", """@controllers.SocialAuthController@.getLoggedUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """u""", """@controllers.SocialAuthController@.u"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.SocialAuthController.logoutUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.get.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_browse1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("browse")))
  )
  private[this] lazy val controllers_Application_browse1_invoker = createInvoker(
    Application_4.get.browse,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "browse",
      Nil,
      "GET",
      """""",
      this.prefix + """browse"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_product2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_Application_product2_invoker = createInvoker(
    Application_4.get.product(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "product",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """product"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_categories3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_Application_categories3_invoker = createInvoker(
    Application_4.get.categories,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "categories",
      Nil,
      "GET",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_category4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_Application_category4_invoker = createInvoker(
    Application_4.get.category(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "category",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """category"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_getcat5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getcategory")))
  )
  private[this] lazy val controllers_Application_getcat5_invoker = createInvoker(
    Application_4.get.getcat(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getcat",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """getcategory"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_cart6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Application_cart6_invoker = createInvoker(
    Application_4.get.cart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "cart",
      Nil,
      "GET",
      """""",
      this.prefix + """cart"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_showorders7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showorders")))
  )
  private[this] lazy val controllers_Application_showorders7_invoker = createInvoker(
    Application_4.get.showorders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showorders",
      Nil,
      "GET",
      """GET     /createproduct              @controllers.Application.createproduct""",
      this.prefix + """showorders"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_pbrowse8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pbrowse")))
  )
  private[this] lazy val controllers_Application_pbrowse8_invoker = createInvoker(
    Application_4.get.pbrowse,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "pbrowse",
      Nil,
      "GET",
      """""",
      this.prefix + """pbrowse"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_newparcel9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newparcel")))
  )
  private[this] lazy val controllers_Application_newparcel9_invoker = createInvoker(
    Application_4.get.newparcel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newparcel",
      Nil,
      "POST",
      """""",
      this.prefix + """newparcel"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_newproduct10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newproduct")))
  )
  private[this] lazy val controllers_Application_newproduct10_invoker = createInvoker(
    Application_4.get.newproduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newproduct",
      Nil,
      "POST",
      """""",
      this.prefix + """newproduct"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_sendorder11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendorder")))
  )
  private[this] lazy val controllers_Application_sendorder11_invoker = createInvoker(
    Application_4.get.sendorder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sendorder",
      Nil,
      "POST",
      """""",
      this.prefix + """sendorder"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_addtocart12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocart")))
  )
  private[this] lazy val controllers_Application_addtocart12_invoker = createInvoker(
    Application_4.get.addtocart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addtocart",
      Nil,
      "POST",
      """""",
      this.prefix + """addtocart"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_newcategory13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newcategory")))
  )
  private[this] lazy val controllers_Application_newcategory13_invoker = createInvoker(
    Application_4.get.newcategory,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newcategory",
      Nil,
      "POST",
      """""",
      this.prefix + """newcategory"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_removefromcart14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removefromcart/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removefromcart14_invoker = createInvoker(
    Application_4.get.removefromcart(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removefromcart",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """removefromcart/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_removeproduct15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeproduct/"), DynamicPart("pid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removeproduct15_invoker = createInvoker(
    Application_4.get.removeproduct(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removeproduct",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """removeproduct/""" + "$" + """pid<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_removecategory16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removecategory/"), DynamicPart("gid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removecategory16_invoker = createInvoker(
    Application_4.get.removecategory(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removecategory",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """removecategory/""" + "$" + """gid<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_removeorder17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeorder/"), DynamicPart("oid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removeorder17_invoker = createInvoker(
    Application_4.get.removeorder(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removeorder",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """removeorder/""" + "$" + """oid<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_removeparcel18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeparcel/"), DynamicPart("oid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removeparcel18_invoker = createInvoker(
    Application_4.get.removeparcel(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removeparcel",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """removeparcel/""" + "$" + """oid<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_removeuser19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeuser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removeuser19_invoker = createInvoker(
    Application_4.get.removeuser(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removeuser",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """removeuser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_showtest20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showtest")))
  )
  private[this] lazy val controllers_Application_showtest20_invoker = createInvoker(
    Application_4.get.showtest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showtest",
      Nil,
      "GET",
      """""",
      this.prefix + """showtest"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_removetest21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removetest")))
  )
  private[this] lazy val controllers_Application_removetest21_invoker = createInvoker(
    Application_4.get.removetest(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removetest",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """removetest"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_newtest22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newtest")))
  )
  private[this] lazy val controllers_Application_newtest22_invoker = createInvoker(
    Application_4.get.newtest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newtest",
      Nil,
      "POST",
      """""",
      this.prefix + """newtest"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_gu23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registereduser")))
  )
  private[this] lazy val controllers_Application_gu23_invoker = createInvoker(
    Application_4.get.gu,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "gu",
      Nil,
      "GET",
      """GET     /registereduser             @controllers.UserController.getAll""",
      this.prefix + """registereduser"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_UserController_getByUserId24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getByUserId24_invoker = createInvoker(
    UserController_0.get.getByUserId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getByUserId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_SocialAuthController_authenticate25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate25_invoker = createInvoker(
    SocialAuthController_3.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_SocialAuthController_getLoggedUser26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getLoggedUser")))
  )
  private[this] lazy val controllers_SocialAuthController_getLoggedUser26_invoker = createInvoker(
    SocialAuthController_1.get.getLoggedUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "getLoggedUser",
      Nil,
      "GET",
      """""",
      this.prefix + """getLoggedUser"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_SocialAuthController_u27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("u")))
  )
  private[this] lazy val controllers_SocialAuthController_u27_invoker = createInvoker(
    SocialAuthController_1.get.u,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "u",
      Nil,
      "GET",
      """""",
      this.prefix + """u"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_SocialAuthController_logoutUser28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_SocialAuthController_logoutUser28_invoker = createInvoker(
    SocialAuthController_3.logoutUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "logoutUser",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_SocialAuthController_authenticate29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate29_invoker = createInvoker(
    SocialAuthController_3.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Assets_at30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at30_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.get.index)
      }
  
    // @LINE:7
    case controllers_Application_browse1_route(params) =>
      call { 
        controllers_Application_browse1_invoker.call(Application_4.get.browse)
      }
  
    // @LINE:8
    case controllers_Application_product2_route(params) =>
      call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        controllers_Application_product2_invoker.call(Application_4.get.product(id))
      }
  
    // @LINE:9
    case controllers_Application_categories3_route(params) =>
      call { 
        controllers_Application_categories3_invoker.call(Application_4.get.categories)
      }
  
    // @LINE:10
    case controllers_Application_category4_route(params) =>
      call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        controllers_Application_category4_invoker.call(Application_4.get.category(id))
      }
  
    // @LINE:11
    case controllers_Application_getcat5_route(params) =>
      call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        controllers_Application_getcat5_invoker.call(Application_4.get.getcat(id))
      }
  
    // @LINE:12
    case controllers_Application_cart6_route(params) =>
      call { 
        controllers_Application_cart6_invoker.call(Application_4.get.cart)
      }
  
    // @LINE:14
    case controllers_Application_showorders7_route(params) =>
      call { 
        controllers_Application_showorders7_invoker.call(Application_4.get.showorders)
      }
  
    // @LINE:17
    case controllers_Application_pbrowse8_route(params) =>
      call { 
        controllers_Application_pbrowse8_invoker.call(Application_4.get.pbrowse)
      }
  
    // @LINE:19
    case controllers_Application_newparcel9_route(params) =>
      call { 
        controllers_Application_newparcel9_invoker.call(Application_4.get.newparcel)
      }
  
    // @LINE:22
    case controllers_Application_newproduct10_route(params) =>
      call { 
        controllers_Application_newproduct10_invoker.call(Application_4.get.newproduct)
      }
  
    // @LINE:23
    case controllers_Application_sendorder11_route(params) =>
      call { 
        controllers_Application_sendorder11_invoker.call(Application_4.get.sendorder)
      }
  
    // @LINE:24
    case controllers_Application_addtocart12_route(params) =>
      call { 
        controllers_Application_addtocart12_invoker.call(Application_4.get.addtocart)
      }
  
    // @LINE:25
    case controllers_Application_newcategory13_route(params) =>
      call { 
        controllers_Application_newcategory13_invoker.call(Application_4.get.newcategory)
      }
  
    // @LINE:29
    case controllers_Application_removefromcart14_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_Application_removefromcart14_invoker.call(Application_4.get.removefromcart(title))
      }
  
    // @LINE:30
    case controllers_Application_removeproduct15_route(params) =>
      call(params.fromPath[Int]("pid", None)) { (pid) =>
        controllers_Application_removeproduct15_invoker.call(Application_4.get.removeproduct(pid))
      }
  
    // @LINE:31
    case controllers_Application_removecategory16_route(params) =>
      call(params.fromPath[Int]("gid", None)) { (gid) =>
        controllers_Application_removecategory16_invoker.call(Application_4.get.removecategory(gid))
      }
  
    // @LINE:32
    case controllers_Application_removeorder17_route(params) =>
      call(params.fromPath[Int]("oid", None)) { (oid) =>
        controllers_Application_removeorder17_invoker.call(Application_4.get.removeorder(oid))
      }
  
    // @LINE:34
    case controllers_Application_removeparcel18_route(params) =>
      call(params.fromPath[Int]("oid", None)) { (oid) =>
        controllers_Application_removeparcel18_invoker.call(Application_4.get.removeparcel(oid))
      }
  
    // @LINE:35
    case controllers_Application_removeuser19_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_removeuser19_invoker.call(Application_4.get.removeuser(id))
      }
  
    // @LINE:38
    case controllers_Application_showtest20_route(params) =>
      call { 
        controllers_Application_showtest20_invoker.call(Application_4.get.showtest)
      }
  
    // @LINE:39
    case controllers_Application_removetest21_route(params) =>
      call(params.fromQuery[Int]("t", Some(0))) { (t) =>
        controllers_Application_removetest21_invoker.call(Application_4.get.removetest(t))
      }
  
    // @LINE:40
    case controllers_Application_newtest22_route(params) =>
      call { 
        controllers_Application_newtest22_invoker.call(Application_4.get.newtest)
      }
  
    // @LINE:43
    case controllers_Application_gu23_route(params) =>
      call { 
        controllers_Application_gu23_invoker.call(Application_4.get.gu)
      }
  
    // @LINE:44
    case controllers_UserController_getByUserId24_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_getByUserId24_invoker.call(UserController_0.get.getByUserId(id))
      }
  
    // @LINE:45
    case controllers_SocialAuthController_authenticate25_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate25_invoker.call(SocialAuthController_3.authenticate(provider))
      }
  
    // @LINE:46
    case controllers_SocialAuthController_getLoggedUser26_route(params) =>
      call { 
        controllers_SocialAuthController_getLoggedUser26_invoker.call(SocialAuthController_1.get.getLoggedUser)
      }
  
    // @LINE:47
    case controllers_SocialAuthController_u27_route(params) =>
      call { 
        controllers_SocialAuthController_u27_invoker.call(SocialAuthController_1.get.u)
      }
  
    // @LINE:48
    case controllers_SocialAuthController_logoutUser28_route(params) =>
      call { 
        controllers_SocialAuthController_logoutUser28_invoker.call(SocialAuthController_3.logoutUser)
      }
  
    // @LINE:50
    case controllers_SocialAuthController_authenticate29_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate29_invoker.call(SocialAuthController_3.authenticate(provider))
      }
  
    // @LINE:55
    case controllers_Assets_at30_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at30_invoker.call(Assets_2.at(path, file))
      }
  }
}
