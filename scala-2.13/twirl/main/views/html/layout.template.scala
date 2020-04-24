
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import helper._

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Http.Session,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String)(session: Http.Session)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.55*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*9.103*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("css/bootstrap-table.min.css")),format.raw/*10.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("css/style.css")),format.raw/*11.95*/("""">
    </head>
    <body>
        <div style="background-color:midnightblue;" class="container p-3 my-3 bg-dark text-white"> 
            <h1 style="font-size: 50px; font-weight: 100;">
                Georgia Southern Workout Builder
            </h1> 
        </div></center>
        <div class="sidenav" style="background-color:seashell; width:200px; align">
            <h2>
            Body Mass Index Calculator
            </h2>
            <form action="/bodyMassIndex" method="POST" href=""""),_display_(/*23.64*/routes/*23.70*/.ClientController.index(h, w)),format.raw/*23.99*/("""" >
                <label for="weight">Weight(in lbs):</label>
                <input type="text" id="weight" name="weight"><br><br>
                <label for="height">Height(in inches):</label>
                <input type="text" id="height" name="height"><br><br>
                <input type="submit" value="Submit">
                <script>
                    var h = new getHeight();
                    var w = new getWeight();
                    function getHeight()"""),format.raw/*32.41*/("""{"""),format.raw/*32.42*/("""
                    """),format.raw/*33.21*/("""this.height = document.getElementById("height").value;
                    return height;
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/("""
                """),format.raw/*36.17*/("""function getWeight()"""),format.raw/*36.37*/("""{"""),format.raw/*36.38*/("""
                     """),format.raw/*37.22*/("""this.weight = document.getElementById("weight").value;
                    return weight;
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
                """),format.raw/*40.17*/("""</script>
            </form> 
        </div>
        <div class="container">
            """),_display_(/*44.14*/content),format.raw/*44.21*/("""
        """),format.raw/*45.9*/("""</div>

        <script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("js/jquery-3.4.1.min.js")),format.raw/*47.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*48.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("js/bootstrap-table.min.js")),format.raw/*49.75*/(""""></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("js/myscript.js")),format.raw/*50.64*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,session:Http.Session,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(session)(content)

  def f:((String) => (Http.Session) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (session) => (content) => apply(title)(session)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-23T22:56:17.729139600
                  SOURCE: C:/Users/zb009/Documents/databaseproject/app/views/layout.scala.html
                  HASH: 470e8b32b75f23cfe1a87c0216c049192fa247d6
                  MATRIX: 651->1|990->21|1138->74|1168->78|1257->141|1282->146|1372->210|1386->216|1449->258|1534->316|1549->322|1619->370|1704->428|1719->434|1774->468|2312->979|2327->985|2377->1014|2889->1498|2918->1499|2968->1521|3104->1629|3133->1630|3179->1648|3227->1668|3256->1669|3307->1692|3443->1800|3472->1801|3518->1819|3640->1914|3668->1921|3705->1931|3764->1963|3779->1969|3843->2012|3928->2070|3943->2076|4004->2116|4089->2174|4104->2180|4171->2226|4233->2261|4248->2267|4304->2302
                  LINES: 24->1|29->3|34->3|36->5|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|54->23|54->23|54->23|63->32|63->32|64->33|66->35|66->35|67->36|67->36|67->36|68->37|70->39|70->39|71->40|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50
                  -- GENERATED --
              */
          