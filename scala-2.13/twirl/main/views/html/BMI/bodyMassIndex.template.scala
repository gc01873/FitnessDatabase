
package views.html.BMI

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

object bodyMassIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Http.Session,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(session : Http.Session, bmi : Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.41*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/layout("Body Mass Index")/*8.27*/(session)/*8.36*/{_display_(Seq[Any](format.raw/*8.37*/("""
    """),format.raw/*9.5*/("""<html>
        <body>
             <h1>
                 Your BMI is 
             </h1>
        </body>
    </html>
""")))}))
      }
    }
  }

  def render(session:Http.Session,bmi:Integer): play.twirl.api.HtmlFormat.Appendable = apply(session,bmi)

  def f:((Http.Session,Integer) => play.twirl.api.HtmlFormat.Appendable) = (session,bmi) => apply(session,bmi)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-23T22:35:04.686143900
                  SOURCE: C:/Users/zb009/Documents/databaseproject/app/views/BMI/bodyMassIndex.scala.html
                  HASH: 3aa3987e8e3ca67cbadf0eb3f47738159d746c6e
                  MATRIX: 655->1|679->20|1024->41|1136->85|1181->80|1211->102|1241->107|1274->132|1291->141|1329->142|1361->148
                  LINES: 24->1|25->2|30->3|33->5|36->3|38->6|40->8|40->8|40->8|40->8|41->9
                  -- GENERATED --
              */
          