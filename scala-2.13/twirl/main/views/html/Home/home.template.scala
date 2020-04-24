
package views.html.Home

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
/*1.2*/import java.util
/*2.2*/import misc.Search

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(session: Http.Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*8.103*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("css/bootstrap-table.min.css")),format.raw/*9.109*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.55*/routes/*10.61*/.Assets.versioned("css/style.css")),format.raw/*10.95*/("""">
    </head>
    <body>
        <center>
            <div style="background-color:midnightblue;" class="container p-3 my-3 bg-dark text-white"> 
                <h1 style="font-size: 50px; font-weight: 100;">
                    Georgia Southern Workout Builder
                </h1> 
            </div></center>
            <div class="sidenav" style="background-color:seashell; width:200px; align">
                <h2>
                Body Mass Index Calculator
                </h2>
                <form action="/bodyMassIndex" method="POST" href=""""),_display_(/*23.68*/routes/*23.74*/.ClientController.index()),format.raw/*23.99*/("""" >
                    <label for="weight">Weight(in lbs):</label>
                    <input type="text" id="weight" name="weight"><br><br>
                    <label for="height">Height(in inches):</label>
                    <input type="text" id="height" name="height"><br><br>
                    <input type="submit" value="Submit">
                    <script>
                    function getHeight()"""),format.raw/*30.41*/("""{"""),format.raw/*30.42*/("""
                        """),format.raw/*31.25*/("""var height = document.getElementById("height").value;
                        return height;
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/("""
                    """),format.raw/*34.21*/("""function getWeight()"""),format.raw/*34.41*/("""{"""),format.raw/*34.42*/("""
                        """),format.raw/*35.25*/("""var weight = document.getElementById("weight").value;
                        return weight;
                    """),format.raw/*37.21*/("""}"""),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""</script>
                </form> 
            </div>
    </body>
</html>"""))
      }
    }
  }

  def render(session:Http.Session): play.twirl.api.HtmlFormat.Appendable = apply(session)

  def f:((Http.Session) => play.twirl.api.HtmlFormat.Appendable) = (session) => apply(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-23T22:10:55.960936300
                  SOURCE: C:/Users/zb009/Documents/databaseproject/app/views/Home/home.scala.html
                  HASH: 7cffd1526f7c3c62f3c64e5c3da258e34c19d5cb
                  MATRIX: 656->1|680->20|1008->41|1126->64|1156->68|1273->159|1287->165|1350->207|1434->265|1448->271|1517->319|1602->377|1617->383|1672->417|2268->986|2283->992|2329->1017|2773->1433|2802->1434|2856->1460|2999->1575|3028->1576|3078->1598|3126->1618|3155->1619|3209->1645|3352->1760|3381->1761|3431->1783
                  LINES: 24->1|25->2|30->3|35->3|37->5|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|55->23|55->23|55->23|62->30|62->30|63->31|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|70->38
                  -- GENERATED --
              */
          