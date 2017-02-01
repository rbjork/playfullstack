
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object health_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class health extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[CreateHealthForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(healthform: Form[CreateHealthForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.67*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<script type='text/javascript' src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.versioned("javascripts/index.js")),format.raw/*6.89*/("""'></script>

    <ul id="checkins"></ul>

    """),_display_(/*10.6*/form(routes.HealthController.addHealth())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
        """),_display_(/*11.10*/inputText(healthform("ckinID"))),format.raw/*11.41*/("""
        """),_display_(/*12.10*/inputText(healthform("prescription"))),format.raw/*12.47*/("""
        """),_display_(/*13.10*/inputText(healthform("take"))),format.raw/*13.39*/("""
        """),_display_(/*14.10*/inputText(healthform("timeTaken"))),format.raw/*14.44*/("""

        """),format.raw/*16.9*/("""<div class="buttons">
            <input type="submit" value="Add Health"/>
        </div>
    """)))}),format.raw/*19.6*/("""
""")))}))
      }
    }
  }

  def render(healthform:Form[CreateHealthForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(healthform)(messages)

  def f:((Form[CreateHealthForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (healthform) => (messages) => apply(healthform)(messages)

  def ref: this.type = this

}


}

/**/
object health extends health_Scope0.health
              /*
                  -- GENERATED --
                  DATE: Sun Jan 22 11:43:56 PST 2017
                  SOURCE: /Users/ronaldbjork/playworkspace/play-scala-intro/app/views/health.scala.html
                  HASH: 9d26b1a8fcb571b6e35f5baaadf4f9e2af11461c
                  MATRIX: 554->1|729->66|757->85|784->87|815->110|854->112|885->117|948->154|962->160|1023->201|1096->248|1146->289|1186->291|1223->301|1275->332|1312->342|1370->379|1407->389|1457->418|1494->428|1549->462|1586->472|1712->568
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|33->10|33->10|33->10|34->11|34->11|35->12|35->12|36->13|36->13|37->14|37->14|39->16|42->19
                  -- GENERATED --
              */
          