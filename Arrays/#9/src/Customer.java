import java.util.ArrayList;

/**
 * Created by UGURINAL
 * on 8/24/2019
 * at 11:02 PM
 * AutoboxingAndUnboxingChallenge
 */

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmaount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmaount);
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
