/**
 * Created by UGURINAL
 * 7/23/2019
 * 7:18 PM
 **/


public class VipCustomer {

    private String customerName;
    private String email;
    private double creditLimit;

    public VipCustomer(String customerName, String email, double creditLimit){
        this.customerName = customerName;
        this.email = email;
        this.creditLimit = creditLimit;
        System.out.println("Constructor with 3 parameters called...");
    }
    public VipCustomer(){
        this("Default name","Default e mail adress",1000);
        System.out.println("Empty constructor called. Initilizing default parameters...");
    }
    public VipCustomer(String customerName,String email){
        this(customerName,email,1000);
        System.out.println("Constructor with 2 parameters called...");
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void getFullInformation(){
        System.out.println("Name = "+this.customerName);
        System.out.println("E-mail = "+this.email);
        System.out.println("Credit limit = "+this.creditLimit);
    }
}
