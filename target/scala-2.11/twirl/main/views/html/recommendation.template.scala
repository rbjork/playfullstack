
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recommendation_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class recommendation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[CreateRecommendationForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recform: Form[CreateRecommendationForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
    """),format.raw/*6.5*/("""<script type='text/javascript' src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.versioned("javascripts/index.js")),format.raw/*6.89*/("""'></script>

    <ul id="checkins"></ul>

    """),_display_(/*10.6*/form(routes.RecommendationController.addRecommendation())/*10.63*/ {_display_(Seq[Any](format.raw/*10.65*/("""
        """),_display_(/*11.10*/inputText(recform("instructions"))),format.raw/*11.44*/("""
        """),_display_(/*12.10*/inputText(recform("doctorsName"))),format.raw/*12.43*/("""
        """),_display_(/*13.10*/inputText(recform("patientID"))),format.raw/*13.41*/("""
        """),_display_(/*14.10*/inputText(recform("rxnumber"))),format.raw/*14.40*/("""
        """),_display_(/*15.10*/inputText(recform("dosage"))),format.raw/*15.38*/("""
        """),_display_(/*16.10*/inputText(recform("current"))),format.raw/*16.39*/("""

        """),format.raw/*18.9*/("""<div class="buttons">
            <input type="submit" value="Add Recommendation"/>
        </div>
    """)))}),format.raw/*21.6*/("""
""")))}))
      }
    }
  }

  def render(recform:Form[CreateRecommendationForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(recform)(messages)

  def f:((Form[CreateRecommendationForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (recform) => (messages) => apply(recform)(messages)

  def ref: this.type = this

}


}

/**/
object recommendation extends recommendation_Scope0.recommendation
              /*
                  -- GENERATED --
                  DATE: Sun Jan 22 11:43:56 PST 2017
                  SOURCE: /Users/ronaldbjork/playworkspace/play-scala-intro/app/views/recommendation.scala.html
                  HASH: 9b4e3a86f878dec03f5d98cc89b720165aad0090
                  MATRIX: 578->1|758->71|786->90|813->92|844->115|883->117|914->122|977->159|991->165|1052->206|1125->253|1191->310|1231->312|1268->322|1323->356|1360->366|1414->399|1451->409|1503->440|1540->450|1591->480|1628->490|1677->518|1714->528|1764->557|1801->567|1935->671
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|33->10|33->10|33->10|34->11|34->11|35->12|35->12|36->13|36->13|37->14|37->14|38->15|38->15|39->16|39->16|41->18|44->21
                  -- GENERATED --
              */
          