
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
"""),format.raw/*4.1*/("""< p class ="lead">Add or Update a Product</p>
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
            <button type="button" class="btn btn=warning">Cancel <class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
            "Success! updated successfully">
        </a>
    </div>
""")))}),format.raw/*25.19*/("""
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
                  DATE: Wed Dec 13 17:14:01 GMT 2017
                  SOURCE: /home/wdd/webapps/play/lab8part1/app/views/addProduct.scala.html
                  HASH: c9a9cd026646fc325ec416b3e0c3f13ee146487d
                  MATRIX: 967->1|1074->37|1119->35|1146->54|1173->73|1212->75|1239->76|1311->123|1418->221|1457->222|1489->255|1521->350|1552->356|1564->360|1594->370|1628->378|1724->453|1756->459|1866->548|1898->554|1996->631|2028->637|2126->714|2159->721|2244->785|2277->791|2426->913|2441->919|2483->940|2724->1167
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|40->8|40->8|40->8|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|48->16|50->18|52->20|52->20|52->20|57->25
                  -- GENERATED --
              */
          