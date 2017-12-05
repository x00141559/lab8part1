package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.*;
import views.html.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

   
    public Result index() {
        List<Product> productList = Product.findAll();
        return ok(index.render(productList));
    }

 
    public Result Customer() {
        List<Customer> customerList = Customer.findAll();
        return ok(index.render(customerList));
    }

}
