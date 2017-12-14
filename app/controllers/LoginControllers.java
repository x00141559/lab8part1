package controllers;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transcational;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;

public class LoginControllers extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Injectpublic LoginController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }
    public Result login() {
        Form<login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm));
    }
}
