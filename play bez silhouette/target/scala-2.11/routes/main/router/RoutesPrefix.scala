
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/BanaN/Desktop/sil/play bez silhouette/conf/routes
// @DATE:Sun Jul 30 02:36:38 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
