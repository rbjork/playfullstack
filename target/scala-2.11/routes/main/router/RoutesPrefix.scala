
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ronaldbjork/playworkspace/play-scala-intro/conf/routes
// @DATE:Thu Jan 26 10:03:59 PST 2017


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
