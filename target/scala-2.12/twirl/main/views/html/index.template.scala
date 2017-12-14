
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.3*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.70*/("""
 """),_display_(/*3.3*/main("Products Page")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>
<div class="row">
  <div class="col-sm-2">

<h4>Categories</h4>
<div class="list-group">
  <a href=""""),_display_(/*11.13*/routes/*11.19*/.HomeController.index(0)),format.raw/*11.43*/("""" class="list-group-item">All categories</a>
  """),_display_(/*12.4*/for(c <- categories) yield /*12.24*/{_display_(Seq[Any](format.raw/*12.25*/("""
    """),format.raw/*13.5*/("""<a href =""""),_display_(/*13.16*/routes/*13.22*/.HomeController.index(c.getId)),format.raw/*13.52*/("""" class="list-group-item">"""),_display_(/*13.79*/c/*13.80*/.getName),format.raw/*13.88*/("""
      """),format.raw/*14.7*/("""<span class="badge">"""),_display_(/*14.28*/c/*14.29*/.getProducts.size()),format.raw/*14.48*/("""</span>
    </a>
  """)))}),format.raw/*16.4*/("""
"""),format.raw/*17.1*/("""</ul>
</div>
<div class="col-sm-10">
  """),format.raw/*20.67*/("""
  """),_display_(/*21.4*/if(flash.containsKey("success"))/*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
    """),format.raw/*22.5*/("""<div class="alert alert-success">
      """),_display_(/*23.8*/flash/*23.13*/.get("success")),format.raw/*23.28*/("""
    """),format.raw/*24.5*/("""</div>
  """)))}),format.raw/*25.4*/("""
  
  """),format.raw/*27.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>

  <th>Category</th>

  <th>Description</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  """),format.raw/*52.54*/("""
  """),_display_(/*53.4*/for(p<-products) yield /*53.20*/ {_display_(Seq[Any](format.raw/*53.22*/("""
    """),format.raw/*54.5*/("""<tr>
      <td>"""),_display_(/*55.12*/p/*55.13*/.getId),format.raw/*55.19*/("""</td>
      <td>"""),_display_(/*56.12*/p/*56.13*/.getName),format.raw/*56.21*/("""</td>
      <td>"""),_display_(/*57.12*/p/*57.13*/.getCategory.getName),format.raw/*57.33*/("""</td>
      <td>"""),_display_(/*58.12*/p/*58.13*/.getDescription),format.raw/*58.28*/("""</td>
      <td>"""),_display_(/*59.12*/p/*59.13*/.getStock),format.raw/*59.22*/("""</td>
    <numeric><td>&euro; """),_display_(/*60.26*/("%.2f".format(p.getPrice))),format.raw/*60.53*/("""</td></numeric>
<!-- -edit -->
    <td><a href =""""),_display_(/*62.20*/routes/*62.26*/.HomeController.updateProduct(p.getId)),format.raw/*62.64*/(""""
      class="button-xs btn-danger" >
      <span class ="glyphicon glyphicon-pencil"></span></a></td> 


<!-- -delete -->

    <td><a href =""""),_display_(/*69.20*/routes/*69.26*/.HomeController.deleteProduct(p.getId)),format.raw/*69.64*/("""" 
    class="button-xs btn-danger" onclick="return confirmDel();">
  <span class ="glyphicon glyphicon-trash"></span></a></td></tr>
    
  """)))}),format.raw/*73.4*/(""" """),format.raw/*73.26*/("""
  
  
"""),format.raw/*76.1*/("""</tbody>
</table>
  
 
 
 <p> <a href = """"),_display_(/*81.18*/routes/*81.24*/.HomeController.addProduct()),format.raw/*81.52*/("""">
  <button class = "btn btn-primary">Add a Product</button>
</a>
</p>
</div>
</div>
""")))}),format.raw/*87.2*/("""

 
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 14 12:39:30 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/index.scala.html
                  HASH: c7f5d09275fb6be285173865b78e687f4c952277
                  MATRIX: 984->3|1146->70|1174->73|1203->94|1242->96|1274->102|1440->241|1455->247|1500->271|1574->319|1610->339|1649->340|1681->345|1719->356|1734->362|1785->392|1839->419|1849->420|1878->428|1912->435|1960->456|1970->457|2010->476|2060->496|2088->497|2155->600|2185->604|2226->636|2266->638|2298->643|2365->684|2379->689|2415->704|2447->709|2487->719|2520->725|2825->1053|2855->1057|2887->1073|2927->1075|2959->1080|3002->1096|3012->1097|3039->1103|3083->1120|3093->1121|3122->1129|3166->1146|3176->1147|3217->1167|3261->1184|3271->1185|3307->1200|3351->1217|3361->1218|3391->1227|3449->1258|3497->1285|3574->1335|3589->1341|3648->1379|3819->1523|3834->1529|3893->1567|4064->1708|4093->1730|4127->1737|4196->1779|4211->1785|4260->1813|4377->1900
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|47->16|48->17|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|56->25|58->27|83->52|84->53|84->53|84->53|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|93->62|93->62|93->62|100->69|100->69|100->69|104->73|104->73|107->76|112->81|112->81|112->81|118->87
                  -- GENERATED --
              */
          