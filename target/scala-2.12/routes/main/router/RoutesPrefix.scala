
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab8part1/conf/routes
// @DATE:Tue Dec 05 17:26:54 GMT 2017


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
