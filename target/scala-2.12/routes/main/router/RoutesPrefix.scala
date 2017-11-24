
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/java8lab1/conf/routes
// @DATE:Fri Nov 24 15:36:04 GMT 2017


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
