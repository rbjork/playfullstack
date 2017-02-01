
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ronaldbjork/playworkspace/play-scala-intro/conf/routes
// @DATE:Thu Jan 26 10:03:59 PST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PersonController_0: controllers.PersonController,
  // @LINE:14
  MedController_1: controllers.MedController,
  // @LINE:21
  HealthController_2: controllers.HealthController,
  // @LINE:33
  RecommendationController_3: controllers.RecommendationController,
  // @LINE:43
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_0: controllers.PersonController,
    // @LINE:14
    MedController_1: controllers.MedController,
    // @LINE:21
    HealthController_2: controllers.HealthController,
    // @LINE:33
    RecommendationController_3: controllers.RecommendationController,
    // @LINE:43
    Assets_4: controllers.Assets
  ) = this(errorHandler, PersonController_0, MedController_1, HealthController_2, RecommendationController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_0, MedController_1, HealthController_2, RecommendationController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PersonController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.addPerson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.getPersons"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patient/checkin/""" + "$" + """patientID<[^/]+>""", """controllers.MedController.addCheckin(patientID:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkins""", """controllers.MedController.getCheckins"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patient/checkin/""" + "$" + """patientID<[^/]+>""", """controllers.MedController.getPatientCheckins(patientID:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """health""", """controllers.HealthController.health"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addhealth""", """controllers.HealthController.addHealth"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginpatient/""" + "$" + """username<[^/]+>""", """controllers.HealthController.login(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """healths""", """controllers.HealthController.getHealth"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patienthealth/""" + "$" + """ckinID<[^/]+>""", """controllers.HealthController.getPatientHealth(ckinID:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommendation""", """controllers.RecommendationController.recommendation"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addRecommendation""", """controllers.RecommendationController.addRecommendation"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patientrecommendations/""" + "$" + """patientID<[^/]+>""", """controllers.RecommendationController.getPatientRecommendations(patientID:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patient/medications/""" + "$" + """patientID<[^/]+>""", """controllers.RecommendationController.getPatientRecommendations(patientID:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PersonController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PersonController_index0_invoker = createInvoker(
    PersonController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PersonController_addPerson1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_addPerson1_invoker = createInvoker(
    PersonController_0.addPerson,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """person"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PersonController_getPersons2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private[this] lazy val controllers_PersonController_getPersons2_invoker = createInvoker(
    PersonController_0.getPersons,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """persons"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MedController_addCheckin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patient/checkin/"), DynamicPart("patientID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedController_addCheckin3_invoker = createInvoker(
    MedController_1.addCheckin(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedController",
      "addCheckin",
      Seq(classOf[Long]),
      "POST",
      """ GET     /checkin                        controllers.MedController.checkin
 PATIENT API""",
      this.prefix + """patient/checkin/""" + "$" + """patientID<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MedController_getCheckins4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkins")))
  )
  private[this] lazy val controllers_MedController_getCheckins4_invoker = createInvoker(
    MedController_1.getCheckins,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedController",
      "getCheckins",
      Nil,
      "GET",
      """ DOCTORS API
 all checkins""",
      this.prefix + """checkins"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MedController_getPatientCheckins5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patient/checkin/"), DynamicPart("patientID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedController_getPatientCheckins5_invoker = createInvoker(
    MedController_1.getPatientCheckins(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedController",
      "getPatientCheckins",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """patient/checkin/""" + "$" + """patientID<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HealthController_health6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("health")))
  )
  private[this] lazy val controllers_HealthController_health6_invoker = createInvoker(
    HealthController_2.health,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HealthController",
      "health",
      Nil,
      "GET",
      """""",
      this.prefix + """health"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HealthController_addHealth7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addhealth")))
  )
  private[this] lazy val controllers_HealthController_addHealth7_invoker = createInvoker(
    HealthController_2.addHealth,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HealthController",
      "addHealth",
      Nil,
      "POST",
      """ PATIENT API""",
      this.prefix + """addhealth"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HealthController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginpatient/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HealthController_login8_invoker = createInvoker(
    HealthController_2.login(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HealthController",
      "login",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """loginpatient/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HealthController_getHealth9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("healths")))
  )
  private[this] lazy val controllers_HealthController_getHealth9_invoker = createInvoker(
    HealthController_2.getHealth,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HealthController",
      "getHealth",
      Nil,
      "GET",
      """ DOCTORS API
 all checkins""",
      this.prefix + """healths"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HealthController_getPatientHealth10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patienthealth/"), DynamicPart("ckinID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HealthController_getPatientHealth10_invoker = createInvoker(
    HealthController_2.getPatientHealth(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HealthController",
      "getPatientHealth",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """patienthealth/""" + "$" + """ckinID<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_RecommendationController_recommendation11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommendation")))
  )
  private[this] lazy val controllers_RecommendationController_recommendation11_invoker = createInvoker(
    RecommendationController_3.recommendation,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecommendationController",
      "recommendation",
      Nil,
      "GET",
      """""",
      this.prefix + """recommendation"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_RecommendationController_addRecommendation12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addRecommendation")))
  )
  private[this] lazy val controllers_RecommendationController_addRecommendation12_invoker = createInvoker(
    RecommendationController_3.addRecommendation,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecommendationController",
      "addRecommendation",
      Nil,
      "POST",
      """""",
      this.prefix + """addRecommendation"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RecommendationController_getPatientRecommendations13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patientrecommendations/"), DynamicPart("patientID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecommendationController_getPatientRecommendations13_invoker = createInvoker(
    RecommendationController_3.getPatientRecommendations(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecommendationController",
      "getPatientRecommendations",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """patientrecommendations/""" + "$" + """patientID<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_RecommendationController_getPatientRecommendations14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patient/medications/"), DynamicPart("patientID", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecommendationController_getPatientRecommendations14_invoker = createInvoker(
    RecommendationController_3.getPatientRecommendations(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecommendationController",
      "getPatientRecommendations",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """patient/medications/""" + "$" + """patientID<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PersonController_index0_route(params) =>
      call { 
        controllers_PersonController_index0_invoker.call(PersonController_0.index)
      }
  
    // @LINE:7
    case controllers_PersonController_addPerson1_route(params) =>
      call { 
        controllers_PersonController_addPerson1_invoker.call(PersonController_0.addPerson)
      }
  
    // @LINE:8
    case controllers_PersonController_getPersons2_route(params) =>
      call { 
        controllers_PersonController_getPersons2_invoker.call(PersonController_0.getPersons)
      }
  
    // @LINE:14
    case controllers_MedController_addCheckin3_route(params) =>
      call(params.fromPath[Long]("patientID", None)) { (patientID) =>
        controllers_MedController_addCheckin3_invoker.call(MedController_1.addCheckin(patientID))
      }
  
    // @LINE:17
    case controllers_MedController_getCheckins4_route(params) =>
      call { 
        controllers_MedController_getCheckins4_invoker.call(MedController_1.getCheckins)
      }
  
    // @LINE:18
    case controllers_MedController_getPatientCheckins5_route(params) =>
      call(params.fromPath[Long]("patientID", None)) { (patientID) =>
        controllers_MedController_getPatientCheckins5_invoker.call(MedController_1.getPatientCheckins(patientID))
      }
  
    // @LINE:21
    case controllers_HealthController_health6_route(params) =>
      call { 
        controllers_HealthController_health6_invoker.call(HealthController_2.health)
      }
  
    // @LINE:23
    case controllers_HealthController_addHealth7_route(params) =>
      call { 
        controllers_HealthController_addHealth7_invoker.call(HealthController_2.addHealth)
      }
  
    // @LINE:24
    case controllers_HealthController_login8_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_HealthController_login8_invoker.call(HealthController_2.login(username))
      }
  
    // @LINE:29
    case controllers_HealthController_getHealth9_route(params) =>
      call { 
        controllers_HealthController_getHealth9_invoker.call(HealthController_2.getHealth)
      }
  
    // @LINE:30
    case controllers_HealthController_getPatientHealth10_route(params) =>
      call(params.fromPath[Long]("ckinID", None)) { (ckinID) =>
        controllers_HealthController_getPatientHealth10_invoker.call(HealthController_2.getPatientHealth(ckinID))
      }
  
    // @LINE:33
    case controllers_RecommendationController_recommendation11_route(params) =>
      call { 
        controllers_RecommendationController_recommendation11_invoker.call(RecommendationController_3.recommendation)
      }
  
    // @LINE:34
    case controllers_RecommendationController_addRecommendation12_route(params) =>
      call { 
        controllers_RecommendationController_addRecommendation12_invoker.call(RecommendationController_3.addRecommendation)
      }
  
    // @LINE:36
    case controllers_RecommendationController_getPatientRecommendations13_route(params) =>
      call(params.fromPath[Long]("patientID", None)) { (patientID) =>
        controllers_RecommendationController_getPatientRecommendations13_invoker.call(RecommendationController_3.getPatientRecommendations(patientID))
      }
  
    // @LINE:37
    case controllers_RecommendationController_getPatientRecommendations14_route(params) =>
      call(params.fromPath[Long]("patientID", None)) { (patientID) =>
        controllers_RecommendationController_getPatientRecommendations14_invoker.call(RecommendationController_3.getPatientRecommendations(patientID))
      }
  
    // @LINE:43
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
