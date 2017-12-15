
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

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

    <li """),_display_(/*42.10*/if(title=="Customer")/*42.31*/{_display_(Seq[Any](format.raw/*42.32*/("""class="active"""")))}),format.raw/*42.47*/(""">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.HomeController.customer()),format.raw/*43.55*/("""">Customer</a></li>

    <li """),_display_(/*45.10*/if(title=="Login")/*45.28*/{_display_(Seq[Any](format.raw/*45.29*/("""class="active"""")))}),format.raw/*45.44*/(""">
        """),_display_(/*46.10*/if(user !=null)/*46.25*/{_display_(Seq[Any](format.raw/*46.26*/("""

        """),format.raw/*48.9*/("""<a href=""""),_display_(/*48.19*/routes/*48.25*/.LoginController.logout()),format.raw/*48.50*/("""">Logout """),_display_(/*48.60*/user/*48.64*/.getName()),format.raw/*48.74*/("""</a>
        """)))}/*49.11*/else/*49.16*/{_display_(Seq[Any](format.raw/*49.17*/("""

        
    """),format.raw/*52.5*/("""<a href=""""),_display_(/*52.15*/routes/*52.21*/.LoginController.login()),format.raw/*52.45*/("""">Login</a>
        """)))}),format.raw/*53.10*/(""" """),format.raw/*53.11*/("""</li>

    
       
   
    
   
    
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

"""),_display_(/*84.2*/content),format.raw/*84.9*/("""

"""),format.raw/*86.1*/("""</div>

</row>

</container>

<container>

<row>

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</row>

</container>
<script src=""""),_display_(/*105.15*/routes/*105.21*/.Assets.versioned("javascripts/main.js")),format.raw/*105.61*/(""""></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 15 09:58:05 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/main.scala.html
                  HASH: ac5b32bcbf66d4098419448989adaf08186caa9f
                  MATRIX: 970->1|1120->56|1148->58|1264->147|1290->152|1489->324|1504->330|1566->371|1825->603|1854->623|1893->624|1939->639|1987->660|2002->666|2046->689|2184->800|2214->821|2253->822|2299->837|2350->861|2365->867|2412->893|2469->923|2496->941|2535->942|2581->957|2619->968|2643->983|2682->984|2719->994|2756->1004|2771->1010|2817->1035|2854->1045|2867->1049|2898->1059|2931->1074|2944->1079|2983->1080|3025->1095|3062->1105|3077->1111|3122->1135|3174->1156|3203->1157|3567->1495|3594->1502|3623->1504|3809->1662|3825->1668|3887->1708
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|66->34|66->34|66->34|66->34|67->35|67->35|67->35|74->42|74->42|74->42|74->42|75->43|75->43|75->43|77->45|77->45|77->45|77->45|78->46|78->46|78->46|80->48|80->48|80->48|80->48|80->48|80->48|80->48|81->49|81->49|81->49|84->52|84->52|84->52|84->52|85->53|85->53|116->84|116->84|118->86|137->105|137->105|137->105
                  -- GENERATED --
              */
          