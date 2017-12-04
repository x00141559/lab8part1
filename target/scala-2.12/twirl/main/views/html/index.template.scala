
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
  
  <th>Category</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  """),format.raw/*32.54*/("""
  """),_display_(/*33.4*/for(p<-products) yield /*33.20*/ {_display_(Seq[Any](format.raw/*33.22*/("""
    """),format.raw/*34.5*/("""<tr>"""),_display_(/*34.10*/p/*34.11*/.getId),format.raw/*34.17*/("""</td>
      <td>"""),_display_(/*35.12*/p/*35.13*/.getName),format.raw/*35.21*/("""</td>
      <td>"""),_display_(/*36.12*/p/*36.13*/.getDescription),format.raw/*36.28*/("""</td>
      <td>"""),_display_(/*37.12*/p/*37.13*/.getStock),format.raw/*37.22*/("""</td>
      <td>&euro; """),_display_(/*38.19*/("%.2f".format(p.getPrice))),format.raw/*38.46*/("""</td>
    </tr>
  """)))}),format.raw/*40.4*/(""" """),format.raw/*40.26*/("""
  
  
  """),format.raw/*43.3*/("""<tr>
  
  <td>1</td>
  
  <td>Television</td>
  
  <td>Sony 42" LCD"</td>
  
  <td>Television</td>
  
  <td>100</td>
  
  <td>720.00</td>
  
  </tr>
  
  </tbody>
  
  </table>""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 04 18:02:38 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/index.scala.html
                  HASH: df4a32565800a3cde14775621dfbd3c0ee4ce99e
                  MATRIX: 962->3|1089->35|1117->38|1146->59|1185->61|1217->67|1569->442|1599->446|1631->462|1671->464|1703->469|1735->474|1745->475|1772->481|1816->498|1826->499|1855->507|1899->524|1909->525|1945->540|1989->557|1999->558|2029->567|2080->591|2128->618|2177->637|2206->659|2242->668
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|71->40|71->40|74->43
                  -- GENERATED --
              */
          