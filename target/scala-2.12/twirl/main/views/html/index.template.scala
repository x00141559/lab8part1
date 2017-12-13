
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
  """),format.raw/*6.67*/("""
  """),_display_(/*7.4*/if(flash.containsKey("success"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
    """),format.raw/*8.5*/("""<div class="alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
    """),format.raw/*10.5*/("""</div>
  """)))}),format.raw/*11.4*/("""
  
  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
  
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
  """),format.raw/*36.54*/("""
  """),_display_(/*37.4*/for(p<-products) yield /*37.20*/ {_display_(Seq[Any](format.raw/*37.22*/("""
    """),format.raw/*38.5*/("""<tr>
      <td>"""),_display_(/*39.12*/p/*39.13*/.getId),format.raw/*39.19*/("""</td>
      <td>"""),_display_(/*40.12*/p/*40.13*/.getName),format.raw/*40.21*/("""</td>
      <td>"""),_display_(/*41.12*/p/*41.13*/.getDescription),format.raw/*41.28*/("""</td>
      <td>"""),_display_(/*42.12*/p/*42.13*/.getStock),format.raw/*42.22*/("""</td>
    <numeric><td>&euro; """),_display_(/*43.26*/("%.2f".format(p.getPrice))),format.raw/*43.53*/("""</td></numeric>
    <td><a href =""""),_display_(/*44.20*/routes/*44.26*/.HomeController.deleteProduct(p.getId)),format.raw/*44.64*/("""" 
    class="button-xs btn-danger" onclick="return confirmDel();">
  <span class ="glyphicon glyphicon-trash"></span></a></td>
    </tr>
  """)))}),format.raw/*48.4*/(""" """),format.raw/*48.26*/("""
  
  
"""),format.raw/*51.1*/("""</tbody>
</table>
  
 
 
 <p> <a href = """"),_display_(/*56.18*/routes/*56.24*/.HomeController.addProduct()),format.raw/*56.52*/("""">
  <button class = "btn btn-primary">Add a Product</button>
</a>
</p>
""")))}),format.raw/*60.2*/("""

 
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
                  DATE: Wed Dec 13 16:16:48 GMT 2017
                  SOURCE: /home/wdd/webapps/play/lab8part1/app/views/index.scala.html
                  HASH: bf6214436d08b18e2bf16bdc3fc6837de057625f
                  MATRIX: 962->3|1089->35|1117->38|1146->59|1185->61|1217->67|1284->171|1313->175|1353->207|1392->209|1423->214|1489->255|1502->260|1537->275|1569->280|1609->290|1642->296|1928->605|1958->609|1990->625|2030->627|2062->632|2105->648|2115->649|2142->655|2186->672|2196->673|2225->681|2269->698|2279->699|2315->714|2359->731|2369->732|2399->741|2457->772|2505->799|2567->834|2582->840|2641->878|2812->1019|2841->1041|2875->1048|2944->1090|2959->1096|3008->1124|3111->1197
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|75->44|75->44|75->44|79->48|79->48|82->51|87->56|87->56|87->56|91->60
                  -- GENERATED --
              */
          