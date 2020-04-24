// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/zb009/Documents/databaseproject/conf/routes
// @DATE:Thu Apr 23 22:41:45 EDT 2020


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
