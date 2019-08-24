import java.util.ArrayList;

/**
 * Created by UGURINAL
 * on 8/24/2019
 * at 11:07 PM
 * AutoboxingAndUnboxingChallenge
 */

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) != null){
            System.out.println("Customer " +customerName +" already exists.");
            return false;
        } else{
            this.customers.add(new Customer(customerName, initialAmount));
            System.out.println("Customer " +customerName +" added successfully.");
            return true;
        }
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            System.out.println("Transaction successfull.");
            return true;
        }
        System.out.println("Customer " +customerName +" does not exist. Adding transaction was failed.");
        return false;
    }

    private Customer findCustomer(String name){
        Customer checkedCustomer;
        for(int i = 0; i < this.customers.size(); i++){
            checkedCustomer =  this.customers.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
