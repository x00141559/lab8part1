
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
    
  
    <li><a href="/customer">Customer</a></li>
       
    <li><a href="/">Product</a></li>
    
    <li><a href="">Services</a></li>
    
    <li><a href="#">About</a></li>
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

"""),_display_(/*66.2*/content),format.raw/*66.9*/("""

"""),format.raw/*68.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>
<script src=""""),_display_(/*87.15*/routes/*87.21*/.Assets.versioned("javascripts/main.js")),format.raw/*87.61*/(""""></script>
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
                  DATE: Thu Dec 14 12:39:30 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/main.scala.html
                  HASH: 084dd2b727e29c095b43ab0af9b3983e239d8ea7
                  MATRIX: 952->1|1077->31|1105->33|1221->122|1247->127|1446->299|1461->305|1523->346|2253->1050|2280->1057|2309->1059|2494->1217|2509->1223|2570->1263
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|98->66|98->66|100->68|119->87|119->87|119->87
                  -- GENERATED --
              */
          