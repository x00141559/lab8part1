
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.3*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.95*/("""
 """),_display_(/*3.3*/main("Products", user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  
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

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 09:58:05 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/index.scala.html
                  HASH: 36dd7e72fd80ea6bcfa2a217430df3cb864d1f0e
                  MATRIX: 1002->3|1189->95|1217->98|1247->120|1286->122|1318->128|1484->267|1499->273|1544->297|1618->345|1654->365|1693->366|1725->371|1763->382|1778->388|1829->418|1883->445|1893->446|1922->454|1956->461|2004->482|2014->483|2054->502|2104->522|2132->523|2199->626|2229->630|2270->662|2310->664|2342->669|2409->710|2423->715|2459->730|2491->735|2531->745|2564->751|2869->1079|2899->1083|2931->1099|2971->1101|3003->1106|3046->1122|3056->1123|3083->1129|3127->1146|3137->1147|3166->1155|3210->1172|3220->1173|3261->1193|3305->1210|3315->1211|3351->1226|3395->1243|3405->1244|3435->1253|3493->1284|3541->1311|3618->1361|3633->1367|3692->1405|3863->1549|3878->1555|3937->1593|4108->1734|4137->1756|4171->1763|4240->1805|4255->1811|4304->1839|4421->1926
                  LINES: 28->2|33->2|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|47->16|48->17|51->20|52->21|52->21|52->21|53->22|54->23|54->23|54->23|55->24|56->25|58->27|83->52|84->53|84->53|84->53|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|93->62|93->62|93->62|100->69|100->69|100->69|104->73|104->73|107->76|112->81|112->81|112->81|118->87
                  -- GENERATED --
              */
          