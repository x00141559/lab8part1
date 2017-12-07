
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab8part1/conf/routes
// @DATE:Thu Dec 07 13:33:38 GMT 2017


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
