
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
    """),format.raw/*34.5*/("""<td>"""),_display_(/*34.10*/c/*34.11*/.getId),format.raw/*34.17*/("""</td>
      <td>"""),_display_(/*35.12*/c/*35.13*/.getcName),format.raw/*35.22*/("""</td>
      <td>"""),_display_(/*36.12*/c/*36.13*/.getNumber),format.raw/*36.23*/("""</td>
      <td>"""),_display_(/*37.12*/c/*37.13*/.getAge),format.raw/*37.20*/("""</td>
      <td>"""),_display_(/*38.12*/c/*38.13*/.getAddress),format.raw/*38.24*/("""</td>

      <!-- -edit -->
    <td><a href =""""),_display_(/*41.20*/routes/*41.26*/.HomeController.updateCustomer(c.getId)),format.raw/*41.65*/(""""
      class="button-xs btn-danger" >
      <span class ="glyphicon glyphicon-pencil"></span></a></td> 


<!-- -delete -->
      <td><a href =""""),_display_(/*47.22*/routes/*47.28*/.HomeController.deleteCustomer(c.getId)),format.raw/*47.67*/("""" 
        class="button-xs btn-danger" onclick="return confirmDel();">
      <span class ="glyphicon glyphicon-trash"></span></a></td>
        </tr>
    </tr>
  """)))}),format.raw/*52.4*/(""" """),format.raw/*52.26*/("""
  
  
  
  
  """),format.raw/*57.3*/("""</tbody>
  
  </table>
  
  <p> <a href = """"),_display_(/*61.19*/routes/*61.25*/.HomeController.addCustomerSubmit()),format.raw/*61.60*/("""">
    <button class = "btn btn-primary">Add a Customer</button>
  </a>
  </p>""")))}))
      }
    }
  }

  def render(customer:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 17:05:54 GMT 2017
                  SOURCE: /home/wdd/webapps/play/lab8part1/app/views/customer.scala.html
                  HASH: c12d3cfe9c401d0d04b7fca42f9ec72befeaade2
                  MATRIX: 966->3|1094->36|1122->39|1151->60|1190->62|1222->68|1554->424|1584->428|1616->444|1656->446|1688->451|1720->456|1730->457|1757->463|1801->480|1811->481|1841->490|1885->507|1895->508|1926->518|1970->535|1980->536|2008->543|2052->560|2062->561|2094->572|2168->619|2183->625|2243->664|2415->809|2430->815|2490->854|2683->1017|2712->1039|2754->1054|2825->1098|2840->1104|2896->1139
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|72->41|72->41|72->41|78->47|78->47|78->47|83->52|83->52|88->57|92->61|92->61|92->61
                  -- GENERATED --
              */
          