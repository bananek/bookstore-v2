
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/BanaN/Desktop/sil/play bez silhouette/conf/routes
// @DATE:Sun Jul 30 02:36:38 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:45
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def u: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.u",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "u"})
        }
      """
    )
  
    // @LINE:45
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider0))})
          }
        
        }
      """
    )
  
    // @LINE:48
    def logoutUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.logoutUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:46
    def getLoggedUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.getLoggedUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getLoggedUser"})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def getByUserId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getByUserId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.product",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
    // @LINE:12
    def cart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.cart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:22
    def newproduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newproduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newproduct"})
        }
      """
    )
  
    // @LINE:19
    def newparcel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newparcel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newparcel"})
        }
      """
    )
  
    // @LINE:39
    def removetest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removetest",
      """
        function(t0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "removetest" + _qS([(t0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("t", t0))])})
        }
      """
    )
  
    // @LINE:9
    def categories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.categories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:24
    def addtocart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addtocart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addtocart"})
        }
      """
    )
  
    // @LINE:29
    def removefromcart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removefromcart",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removefromcart/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
    // @LINE:7
    def browse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.browse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "browse"})
        }
      """
    )
  
    // @LINE:43
    def gu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.gu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registereduser"})
        }
      """
    )
  
    // @LINE:34
    def removeparcel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removeparcel",
      """
        function(oid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeparcel/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("oid", oid0)})
        }
      """
    )
  
    // @LINE:30
    def removeproduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removeproduct",
      """
        function(pid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeproduct/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("pid", pid0)})
        }
      """
    )
  
    // @LINE:17
    def pbrowse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.pbrowse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pbrowse"})
        }
      """
    )
  
    // @LINE:10
    def category: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.category",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
    // @LINE:14
    def showorders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showorders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showorders"})
        }
      """
    )
  
    // @LINE:40
    def newtest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newtest",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newtest"})
        }
      """
    )
  
    // @LINE:35
    def removeuser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removeuser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeuser/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:23
    def sendorder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sendorder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendorder"})
        }
      """
    )
  
    // @LINE:32
    def removeorder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removeorder",
      """
        function(oid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeorder/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("oid", oid0)})
        }
      """
    )
  
    // @LINE:25
    def newcategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newcategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newcategory"})
        }
      """
    )
  
    // @LINE:11
    def getcat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getcat",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getcategory" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
    // @LINE:38
    def showtest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showtest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showtest"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:31
    def removecategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.removecategory",
      """
        function(gid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removecategory/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("gid", gid0)})
        }
      """
    )
  
  }


}
