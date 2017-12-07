package models;


import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

public class Customer extends Model {

@Id


private Long id;

@Constraints.Required
private String cName;

@Constraints.Required
private String number;

@Constraints.Required
private int age;

@Constraints.Required
private String address;

// Default Constructor

public Customer() {

}
// Constructor to initialise object

public Customer(Long id, String cName, String number, int age, String address) {

this.id = id;

this.cName = cName;

this.number = number;

this.age = age;

this.address = address;}


public static final Finder<Long, Customer> find = new Finder<>(Customer.class);

public static final List<Customer> findAll() {
    return Customer.find.all();
}

 public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}