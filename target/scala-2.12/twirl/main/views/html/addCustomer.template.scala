
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm:Form[models.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),_display_(/*3.2*/main("Add Customer",user)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
"""),format.raw/*4.1*/("""<p class="lead">Add or Update a Customer</p>
"""),_display_(/*5.2*/form(action=routes.HomeController.addCustomerSubmit(),'class -> "form horizontal", 'role -> "form")/*5.101*/{_display_(Seq[Any](format.raw/*5.102*/("""
    """),format.raw/*6.33*/("""
    """),format.raw/*7.95*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""


    """),_display_(/*11.6*/inputText(customerForm("cName"), '_label -> "name", 'class -> "form-control")),format.raw/*11.83*/("""
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

  def render(customerForm:Form[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,user)

  def f:((Form[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,user) => apply(customerForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 09:58:05 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/addCustomer.scala.html
                  HASH: d7ff024f476f6beb1033398c3744009b7073f6d3
                  MATRIX: 987->1|1121->64|1166->62|1193->81|1226->106|1265->108|1292->109|1363->155|1471->254|1510->255|1542->288|1574->383|1605->389|1617->393|1647->403|1681->411|1779->488|1811->494|1912->574|1944->580|2039->654|2071->660|2174->742|2207->749|2293->814|2326->820|2476->943|2491->949|2536->973|2669->1092|2702->1118
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|40->8|40->8|40->8|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|48->16|50->18|52->20|52->20|52->20|56->24|57->25
                  -- GENERATED --
              */
          