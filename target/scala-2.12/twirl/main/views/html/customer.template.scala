
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.3*/(customer: List[models.Customer], user:models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.60*/("""
 """),_display_(/*3.3*/main("Customer Page",user)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
  
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
  
  <p> <a href = """"),_display_(/*61.19*/routes/*61.25*/.HomeController.addCustomer()),format.raw/*61.54*/("""">
    <button class = "btn btn-primary">Add a Customer</button>
  </a>
  </p>""")))}))
      }
    }
  }

  def render(customer:List[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customer,user)

  def f:((List[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customer,user) => apply(customer,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 09:58:05 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/customer.scala.html
                  HASH: ba1b53ef402b0655d6dd19bbc2f0d45c7a722f36
                  MATRIX: 984->3|1136->60|1164->63|1198->89|1237->91|1269->97|1601->453|1631->457|1663->473|1703->475|1735->480|1767->485|1777->486|1804->492|1848->509|1858->510|1888->519|1932->536|1942->537|1973->547|2017->564|2027->565|2055->572|2099->589|2109->590|2141->601|2215->648|2230->654|2290->693|2462->838|2477->844|2537->883|2730->1046|2759->1068|2801->1083|2872->1127|2887->1133|2937->1162
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|72->41|72->41|72->41|78->47|78->47|78->47|83->52|83->52|88->57|92->61|92->61|92->61
                  -- GENERATED --
              */
          