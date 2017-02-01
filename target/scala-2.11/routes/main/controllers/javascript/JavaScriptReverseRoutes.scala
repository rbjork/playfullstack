
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ronaldbjork/playworkspace/play-scala-intro/conf/routes
// @DATE:Thu Jan 26 10:03:59 PST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseMedController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getPatientCheckins: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedController.getPatientCheckins",
      """
        function(patientID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "patient/checkin/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("patientID", patientID0)})
        }
      """
    )
  
    // @LINE:17
    def getCheckins: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedController.getCheckins",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkins"})
        }
      """
    )
  
    // @LINE:14
    def addCheckin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedController.addCheckin",
      """
        function(patientID0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "patient/checkin/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("patientID", patientID0)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseHealthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getHealth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HealthController.getHealth",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "healths"})
        }
      """
    )
  
    // @LINE:23
    def addHealth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HealthController.addHealth",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addhealth"})
        }
      """
    )
  
    // @LINE:30
    def getPatientHealth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HealthController.getPatientHealth",
      """
        function(ckinID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "patienthealth/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("ckinID", ckinID0)})
        }
      """
    )
  
    // @LINE:21
    def health: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HealthController.health",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "health"})
        }
      """
    )
  
    // @LINE:24
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HealthController.login",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginpatient/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseRecommendationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def recommendation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecommendationController.recommendation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommendation"})
        }
      """
    )
  
    // @LINE:34
    def addRecommendation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecommendationController.addRecommendation",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addRecommendation"})
        }
      """
    )
  
    // @LINE:36
    def getPatientRecommendations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecommendationController.getPatientRecommendations",
      """
        function(patientID0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "patientrecommendations/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("patientID", patientID0)})
          }
        
        }
      """
    )
  
  }


}
