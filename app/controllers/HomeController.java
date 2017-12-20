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
import models.users.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    @Security.Authenticated(Secured.class)
    @Transactional
    public Result updateProduct(Long id){
        Product p;
        Form<Product> productForm;
        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addProduct.render(productForm,User.getUserById(session().get("email"))));
        }

    







        @Transactional
        public Result updateCustomer(Long id){
            Customer c;
            Form<Customer> customerForm;
            try{
                c = Customer.find.byId(id);
                customerForm = formFactory.form(Customer.class).fill(c);
            } catch (Exception ex) {
                return badRequest("error");
            }
    
            return ok(addCustomer.render(customerForm, User.getUserById(session().get("email"))));
            }





    private FormFactory formFactory;
    @Inject
    public HomeController (FormFactory f){
    this.formFactory = f;}
   
    public Result index(Long cat) {
        List<Product> productList = null;
        List<Category> categoryList = Category.findAll();
        if (cat ==0){
            productList = Product.findAll();
        } else {
            productList = Category.find.ref(cat).getProducts();
        }
        return ok(index.render(productList,categoryList, User.getUserById(session().get("email"))));
    }

 
    public Result customer() {
        List<Customer> customerList = Customer.findAll();
        return ok(customer.render(customerList,User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm,User.getUserById(session().get("email"))));
    }

    public Result addCustomer(){
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(addCustomer.render(customerForm,User.getUserById(session().get("email"))));
    }





    public Result addProductSubmit(){
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm,User.getUserById(session().get("email"))));
        }else { Product newProduct = newProductForm.get();
            if(newProduct.getId() == null){
                newProduct.save();
            }
else if(newProduct.getId() != null){
    newProduct.update();
}
           
            flash("The product","Product "+"has been added successfully"+ newProduct.getName() +" was added");
            return redirect(controllers.routes.HomeController.index(0));

        }
    }






    public Result addCustomerSubmit(){
        Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest();

        if (newCustomerForm.hasErrors()) {
            return badRequest(addCustomer.render(newCustomerForm, User.getUserById(session().get("email"))));
        }else { Customer newCustomer = newCustomerForm.get();
            if(newCustomer.getId() == null){
                newCustomer.save();
            }
            else if(newCustomer.getId() != null){
                newCustomer.update();
            }
           
            flash("success","Customer "+ newCustomer.getcName() +" was added");
            return redirect(controllers.routes.HomeController.customer());

        }
    }




    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
            public Result deleteProduct(Long id){
                Product.find.ref(id).delete();
                flash("success", "Product has been deleted");
                return redirect(routes.HomeController.index(0));
            }
            public Result deleteCustomer(Long id){
                Customer.find.ref(id).delete();
                flash("success", "Customer has been deleted");
                return redirect(routes.HomeController.customer());
            }
            

            }
    



