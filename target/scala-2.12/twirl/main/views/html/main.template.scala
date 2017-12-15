
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">
    <li """),_display_(/*34.10*/if(title=="Product")/*34.30*/{_display_(Seq[Any](format.raw/*34.31*/("""class="active"""")))}),format.raw/*34.46*/(""">
        <a href =""""),_display_(/*35.20*/routes/*35.26*/.HomeController.index()),format.raw/*35.49*/("""">Product</a>
    </li>
  
    <li><a href="#">About</a></li>

    <li><a href="#">Services</a></li>

    

    <li """),_display_(/*44.10*/if(title=="Login")/*44.28*/{_display_(Seq[Any](format.raw/*44.29*/("""class="active"""")))}),format.raw/*44.44*/(""">
    <a href=""""),_display_(/*45.15*/routes/*45.21*/.LoginController.login()),format.raw/*45.45*/("""">Login</a></li>

    <li """),_display_(/*47.10*/if(title=="Customer")/*47.31*/{_display_(Seq[Any](format.raw/*47.32*/("""class="active"""")))}),format.raw/*47.47*/(""">
        <a href=""""),_display_(/*48.19*/routes/*48.25*/.HomeController.customer()),format.raw/*48.51*/("""">Customer</a></li>
       
   
    
   
    
    </ul>
<!--     
    </ul>
    <li class="active"><a href="/">Product</a></li>
    <li><a href="customer">Customer</a></li>

    <li><a href="">Services</a></li>
    
    <li><a href="#">About</a></li>

</ul> -->
    </div>
    </div>
</div>

</nav>

<container>

<row>

<div class="col-md-12">

"""),_display_(/*77.2*/content),format.raw/*77.9*/("""

"""),format.raw/*79.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>
<script src=""""),_display_(/*98.15*/routes/*98.21*/.Assets.versioned("javascripts/main.js")),format.raw/*98.61*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 08:47:17 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/main.scala.html
                  HASH: edcc080fa5dbb38c297f82f10acfd66f84c4d3ee
                  MATRIX: 952->1|1077->31|1105->33|1221->122|1247->127|1446->299|1461->305|1523->346|1782->578|1811->598|1850->599|1896->614|1944->635|1959->641|2003->664|2147->781|2174->799|2213->800|2259->815|2302->831|2317->837|2362->861|2416->888|2446->909|2485->910|2531->925|2578->945|2593->951|2640->977|3012->1323|3039->1330|3068->1332|3253->1490|3268->1496|3329->1536
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|66->34|66->34|66->34|66->34|67->35|67->35|67->35|76->44|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|79->47|80->48|80->48|80->48|109->77|109->77|111->79|130->98|130->98|130->98
                  -- GENERATED --
              */
          