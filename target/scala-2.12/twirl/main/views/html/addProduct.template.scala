
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm:Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.61*/("""
"""),_display_(/*3.2*/main("Add Product", user)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
"""),format.raw/*4.1*/("""<p class ="lead">Add or Update a Product</p>
"""),_display_(/*5.2*/form(action=routes.HomeController.addProductSubmit(),'class -> "form horizontal", 'role -> "form")/*5.100*/{_display_(Seq[Any](format.raw/*5.101*/("""
    """),format.raw/*6.33*/("""
    """),format.raw/*7.95*/("""
    """),_display_(/*8.6*/CSRF/*8.10*/.formField),format.raw/*8.20*/("""


    """),_display_(/*11.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*11.81*/("""
    """),_display_(/*12.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*12.95*/("""
    """),_display_(/*13.6*/select(
        productForm("category.id"),
        options(Category.options),
        '_label -> "Category", '_default -> "-- Choose a category --",
        '_showConstraints -> false, 'class -> "form-control"
    )),format.raw/*18.6*/("""
    
    """),_display_(/*20.6*/inputText(productForm("stock"), '_label -> "stock", 'class -> "form-control")),format.raw/*20.83*/("""
    """),_display_(/*21.6*/inputText(productForm("price"), '_label -> "price", 'class -> "form-control")),format.raw/*21.83*/("""

    """),_display_(/*23.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.70*/("""

    """),format.raw/*25.5*/("""<div class="actions">
        <input type="submit" value="Add/Update Product" class="btn btn-primary">
        <a href =""""),_display_(/*27.20*/routes/*27.26*/.HomeController.index(0)),format.raw/*27.50*/("""">
            <button type="button" class="btn btn=warning">Cancel</button>
        </a>
    </div>
""")))}),format.raw/*31.19*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 09:58:05 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/addProduct.scala.html
                  HASH: 68f0a429ae21b8c34bfe1297a39bef8854276f2d
                  MATRIX: 985->1|1117->62|1162->60|1189->79|1222->104|1261->106|1288->107|1359->153|1466->251|1505->252|1537->285|1569->380|1600->386|1612->390|1642->400|1676->408|1772->483|1804->489|1914->578|1946->584|2182->800|2219->811|2317->888|2349->894|2447->971|2480->978|2565->1042|2598->1048|2747->1170|2762->1176|2807->1200|2940->1319
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|39->7|40->8|40->8|40->8|43->11|43->11|44->12|44->12|45->13|50->18|52->20|52->20|53->21|53->21|55->23|55->23|57->25|59->27|59->27|59->27|63->31
                  -- GENERATED --
              */
          