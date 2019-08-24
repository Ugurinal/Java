import java.util.ArrayList;

/**
 * Created by UGURINAL
 * on 8/24/2019
 * at 10:56 PM
 * AutoboxingAndUnboxingChallenge
 */

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null){
            System.out.println("Branch " +branchName +" already exists.");
            return false;
        } else{
            this.branches.add(new Branch(branchName));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.newCustomer(customerName, initialAmount);
        }
        System.out.println("Branch " +branchName + " does not exist.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch != null){
            return existingBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        Branch checkedBranch;
        for(int i = 0; i < this.branches.size(); i++){
            checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch existingBranch = findBranch(branchName);
        if(existingBranch == null){
            System.out.println("Branch does not exist.");
            return false;
        } else {
            ArrayList<Customer> customerList = existingBranch.getCustomers();
            System.out.println("Customer details for branch " +existingBranch.getName());

            for(int i= 0; i < customerList.size(); i++){
                    System.out.println("Customer: " +customerList.get(i).getName() + " [" + i + "]");
                    if(showTransactions){
                        ArrayList<Double> transactions = customerList.get(i).getTransactions();
                        System.out.println("Transactions: ");
                        for(int j = 0; j < transactions.size(); j++){
                            System.out.println("["+ ( j + 1 ) + "]" + "Amount: " +transactions.get(j));
                        }
                    }
                }
            return true;

        }
    }
}
