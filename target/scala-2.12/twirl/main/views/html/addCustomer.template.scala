
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm:Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*3.2*/main("Add Customer")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""< p class ="lead">Add or Update a Customer</p>
"""),_display_(/*5.2*/form(action=routes.HomeController.addCustomerSubmit(),'class -> "form horizontal", 'role -> "form")/*5.101*/{_display_(Seq[Any](format.raw/*5.102*/("""
    """),format.raw/*6.33*/("""
    """),format.raw/*7.95*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""


    """),_display_(/*11.6*/inputText(customerForm("name"), '_label -> "name", 'class -> "form-control")),format.raw/*11.82*/("""
    """),_display_(/*12.6*/inputText(customerForm("number"), '_label -> "number", 'class -> "form-control")),format.raw/*12.86*/("""
    """),_display_(/*13.6*/inputText(customerForm("age"), '_label -> "age", 'class -> "form-control")),format.raw/*13.80*/("""
    """),_display_(/*14.6*/inputText(customerForm("address"), '_label -> "address", 'class -> "form-control")),format.raw/*14.88*/("""

    """),_display_(/*16.6*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*16.71*/("""

    """),format.raw/*18.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Customer" class="btn btn-primary">
        <a href =""""),_display_(/*20.20*/routes/*20.26*/.HomeController.customer),format.raw/*20.50*/("""">
            <button type="button" class="btn btn=warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*24.19*/("""
""")))}),format.raw/*25.26*/("""






"""))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 16:52:50 GMT 2017
                  SOURCE: /home/wdd/webapps/play/lab8part1/app/views/addCustomer.scala.html
                  HASH: 388458a4c1afebbf8103cf224af236bc3e4f691b
                  MATRIX: 969->1|1078->39|1123->37|1150->56|1178->76|1217->78|1244->79|1317->127|1425->226|1464->227|1496->260|1528->355|1559->361|1571->365|1601->375|1635->383|1732->459|1764->465|1865->545|1897->551|1992->625|2024->631|2127->713|2160->720|2246->785|2279->791|2429->914|2444->920|2489->944|2622->1063|2655->1089
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|40->8|40->8|40->8|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|48->16|50->18|52->20|52->20|52->20|56->24|57->25
                  -- GENERATED --
              */
          