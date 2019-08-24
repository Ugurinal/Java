/**
 * Created by UGURINAL
 * on 8/24/2019
 * at 10:55 PM
 * AutoboxingAndUnboxingChallenge
 */

public class Main {
    public static void main(String[] args) {

        Bank myBank = new Bank("INAL BANK");
        myBank.addBranch("Adana");

        myBank.addCustomer("Adana","Elif",1000);
        myBank.addCustomer("Adana","Polat",1750000);
        myBank.addCustomer("Adana","Memati",600);
        myBank.addCustomer("Adana","Memati",600);

        myBank.addBranch("İstanbul");

        myBank.addCustomer("İstanbul","Abdülhey",850);

        myBank.addCustomerTransaction("Adana","Elif",750);
        myBank.addCustomerTransaction("Adana","Polat",75000);
        myBank.addCustomerTransaction("Adana","Memati",75000);
        myBank.addCustomerTransaction("Adana","Fluffy",574);

        myBank.listCustomers("Adana",false);
        myBank.listCustomers("Adana",true);

        myBank.addCustomer("Bayburt","Maraz Ali",175);
    }
}
