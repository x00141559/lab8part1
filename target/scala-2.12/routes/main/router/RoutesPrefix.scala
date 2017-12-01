
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/lab8part1/conf/routes
// @DATE:Fri Dec 01 16:21:52 GMT 2017


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
