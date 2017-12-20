
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    """),format.raw/*6.5*/("""<div class="col-xs-4">
        <h3>Sign in</h3>

        """),_display_(/*9.10*/if(loginForm.hasGlobalErrors)/*9.39*/{_display_(Seq[Any](format.raw/*9.40*/("""
            """),format.raw/*10.13*/("""<p class="alert alert-warning">
                """),_display_(/*11.18*/loginForm/*11.27*/.globalError.message),format.raw/*11.47*/("""

            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""

        """),_display_(/*16.10*/if(flash.containsKey("error"))/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
            """),format.raw/*17.13*/("""<p class="alert alert-warning">
                """),_display_(/*18.18*/flash/*18.23*/.get("loginRequired")),format.raw/*18.44*/("""
            """),format.raw/*19.13*/("""</p>
        """)))}),format.raw/*20.10*/("""

        """),_display_(/*22.10*/helper/*22.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*22.80*/{_display_(Seq[Any](format.raw/*22.81*/("""
         """),_display_(/*23.11*/CSRF/*23.15*/.formField),format.raw/*23.25*/("""
         """),format.raw/*24.10*/("""<div class="form-group">
            """),_display_(/*25.14*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*26.72*/("""
        """),format.raw/*27.9*/("""</div>
        <div class="form-group">
            """),_display_(/*29.14*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*30.75*/("""
        """),format.raw/*31.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
        """)))}),format.raw/*35.10*/("""
    """),format.raw/*36.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 23:34:25 GMT 2017
                  SOURCE: /home/wdd/webapps/lab8part1/app/views/login.scala.html
                  HASH: e10bde4e5049add4e1fa8f5ec6476e4f9b047af5
                  MATRIX: 984->1|1119->65|1164->63|1191->81|1219->154|1246->156|1273->175|1312->177|1343->182|1427->240|1464->269|1502->270|1543->283|1619->332|1637->341|1678->361|1720->375|1765->389|1803->400|1842->430|1882->432|1923->445|1999->494|2013->499|2055->520|2096->533|2141->547|2179->558|2194->564|2267->628|2306->629|2344->640|2357->644|2388->654|2426->664|2491->702|2629->819|2665->828|2745->881|2893->1008|2929->1017|3098->1155|3130->1160
                  LINES: 28->1|31->2|34->1|35->3|36->4|37->5|37->5|37->5|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|45->13|46->14|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|54->22|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|58->26|59->27|61->29|62->30|63->31|67->35|68->36
                  -- GENERATED --
              */
          