
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.3*/(customer: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.36*/("""
 """),_display_(/*3.3*/main("Customer Page")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">customer Catalogue</p>
  
  <table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>cName</th>
  
  <th>number</th>
  
  <th>age</th>
  
  <th>address</th>
  
  
  
  </tr>
  
  </thead>
  
  <tbody>
  """),format.raw/*32.55*/("""
  """),_display_(/*33.4*/for(c<-customer) yield /*33.20*/ {_display_(Seq[Any](format.raw/*33.22*/("""
    """),format.raw/*34.5*/("""<tr>"""),_display_(/*34.10*/c/*34.11*/.getId),format.raw/*34.17*/("""</td>
      <td>"""),_display_(/*35.12*/c/*35.13*/.getcName),format.raw/*35.22*/("""</td>
      <td>"""),_display_(/*36.12*/c/*36.13*/.getNumber),format.raw/*36.23*/("""</td>
      <td>"""),_display_(/*37.12*/c/*37.13*/.getAge),format.raw/*37.20*/("""</td>
      <td>"""),_display_(/*38.12*/c/*38.13*/.getAddress),format.raw/*38.24*/("""</td>
    </tr>
  """)))}),format.raw/*40.4*/(""" """),format.raw/*40.26*/("""
  
  
  
  
  """),format.raw/*45.3*/("""</tbody>
  
  </table>""")))}))
      }
    }
  }

  def render(customer:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 07 13:39:49 GMT 2017
                  SOURCE: /media/sf_student/lab8part1/app/views/customer.scala.html
                  HASH: c1cd2e3be569c61fb7ff3cb335fd5db5df6a91e3
                  MATRIX: 966->3|1094->36|1122->39|1151->60|1190->62|1222->68|1554->424|1584->428|1616->444|1656->446|1688->451|1720->456|1730->457|1757->463|1801->480|1811->481|1841->490|1885->507|1895->508|1926->518|1970->535|1980->536|2008->543|2052->560|2062->561|2094->572|2143->591|2172->613|2214->628
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|71->40|71->40|76->45
                  -- GENERATED --
              */
          