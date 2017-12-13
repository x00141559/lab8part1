
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.3*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.35*/("""
 """),_display_(/*3.3*/main("Products Page")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  """),format.raw/*30.54*/("""
  """),_display_(/*31.4*/for(p<-products) yield /*31.20*/ {_display_(Seq[Any](format.raw/*31.22*/("""
    """),format.raw/*32.5*/("""<tr>
      <td>"""),_display_(/*33.12*/p/*33.13*/.getId),format.raw/*33.19*/("""</td>
      <td>"""),_display_(/*34.12*/p/*34.13*/.getName),format.raw/*34.21*/("""</td>
      <td>"""),_display_(/*35.12*/p/*35.13*/.getDescription),format.raw/*35.28*/("""</td>
      <td>"""),_display_(/*36.12*/p/*36.13*/.getStock),format.raw/*36.22*/("""</td>
    <numeric><td>&euro; """),_display_(/*37.26*/("%.2f".format(p.getPrice))),format.raw/*37.53*/("""</td></numeric>
    </tr>
  """)))}),format.raw/*39.4*/(""" """),format.raw/*39.26*/("""
  
  
"""),format.raw/*42.1*/("""</tbody>
</table>
  
 
 
 <p> <a href = """"),_display_(/*47.18*/routes/*47.24*/.HomeController.addProduct()),format.raw/*47.52*/("""">
  <button class = "btn btn-primary">Add a Product</button>
</a>
</p>

 """)))}),format.raw/*52.3*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 12:36:40 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/index.scala.html
                  HASH: b4bcdbe54bdbd21454ebf8cb6618eadacf26ade7
                  MATRIX: 962->3|1089->35|1117->38|1146->59|1185->61|1217->67|1546->419|1576->423|1608->439|1648->441|1680->446|1723->462|1733->463|1760->469|1804->486|1814->487|1843->495|1887->512|1897->513|1933->528|1977->545|1987->546|2017->555|2075->586|2123->613|2182->642|2211->664|2245->671|2314->713|2329->719|2378->747|2483->822
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|61->30|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|70->39|70->39|73->42|78->47|78->47|78->47|83->52
                  -- GENERATED --
              */
          