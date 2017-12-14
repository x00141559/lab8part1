
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm:Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.36*/("""
"""),_display_(/*3.2*/main("Add Product")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p class ="lead">Add or Update a Product</p>
"""),_display_(/*5.2*/form(action=routes.HomeController.addProductSubmit(),'class -> "form horizontal", 'role -> "form")/*5.100*/{_display_(Seq[Any](format.raw/*5.101*/("""
    """),format.raw/*6.33*/("""
    """),format.raw/*7.95*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""


    """),_display_(/*11.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*11.81*/("""
    """),_display_(/*12.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*12.95*/("""
    """),_display_(/*13.6*/inputText(productForm("stock"), '_label -> "stock", 'class -> "form-control")),format.raw/*13.83*/("""
    """),_display_(/*14.6*/inputText(productForm("price"), '_label -> "price", 'class -> "form-control")),format.raw/*14.83*/("""

    """),_display_(/*16.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*16.70*/("""

    """),format.raw/*18.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Product" class="btn btn-primary">
        <a href =""""),_display_(/*20.20*/routes/*20.26*/.HomeController.index),format.raw/*20.47*/("""">
            <button type="button" class="btn btn=warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*24.19*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 14 11:08:06 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/addProduct.scala.html
                  HASH: ff8f8a80960529344221eecdaa6e020f78725869
                  MATRIX: 967->1|1074->37|1119->35|1146->54|1173->73|1212->75|1239->76|1310->122|1417->220|1456->221|1488->254|1520->349|1551->355|1563->359|1593->369|1627->377|1723->452|1755->458|1865->547|1897->553|1995->630|2027->636|2125->713|2158->720|2243->784|2276->790|2425->912|2440->918|2482->939|2615->1058
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|40->8|40->8|40->8|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|48->16|50->18|52->20|52->20|52->20|56->24
                  -- GENERATED --
              */
          