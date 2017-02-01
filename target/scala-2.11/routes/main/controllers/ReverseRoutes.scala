
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ronaldbjork/playworkspace/play-scala-intro/conf/routes
// @DATE:Thu Jan 26 10:03:59 PST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getPersons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "persons")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def addPerson(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "person")
    }
  
  }

  // @LINE:43
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:14
  class ReverseMedController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getPatientCheckins(patientID:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "patient/checkin/" + implicitly[PathBindable[Long]].unbind("patientID", patientID))
    }
  
    // @LINE:17
    def getCheckins(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "checkins")
    }
  
    // @LINE:14
    def addCheckin(patientID:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "patient/checkin/" + implicitly[PathBindable[Long]].unbind("patientID", patientID))
    }
  
  }

  // @LINE:21
  class ReverseHealthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def getHealth(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "healths")
    }
  
    // @LINE:23
    def addHealth(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addhealth")
    }
  
    // @LINE:30
    def getPatientHealth(ckinID:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "patienthealth/" + implicitly[PathBindable[Long]].unbind("ckinID", ckinID))
    }
  
    // @LINE:21
    def health(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "health")
    }
  
    // @LINE:24
    def login(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "loginpatient/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
  }

  // @LINE:33
  class ReverseRecommendationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def recommendation(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recommendation")
    }
  
    // @LINE:34
    def addRecommendation(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addRecommendation")
    }
  
    // @LINE:36
    def getPatientRecommendations(patientID:Long): Call = {
    
      (patientID: @unchecked) match {
      
        // @LINE:36
        case (patientID)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "patientrecommendations/" + implicitly[PathBindable[Long]].unbind("patientID", patientID))
      
      }
    
    }
  
  }


}
