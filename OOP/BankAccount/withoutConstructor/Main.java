/**
 * Created by UGURINAL
 * 7/23/2019
 * 1:41 PM
 **/


public class Main {
    public static void main(String[] args) {

        Account ugur = new Account();

        ugur.setCustomerName("UGUR İNAL");
        ugur.setAccountNumber("00000000");
        ugur.setBalance(13596);
        ugur.setEmail("ugurinal01@hotmail.com");
        ugur.setPhone("XXX-XXX-XXX");

        ugur.getFullInformation();

        ugur.deposit(96563);
        ugur.withdrawal(3214);
        ugur.withdrawal(110160);
        ugur.withdrawal(106945);
        ugur.withdrawal(0);


    }
}
