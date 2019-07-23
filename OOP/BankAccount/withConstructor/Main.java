/**
 * Created by UGURINAL
 * 7/23/2019
 * 1:41 PM
 **/


public class Main {
    public static void main(String[] args) {

        Account ugur = new Account("UGUR İNAL","00000000","ugurinal01@hotmail.com","XXX-XXX-XXXX",50);
        Account test = new Account();

        ugur.getFullInformation();

        ugur.deposit(96563);
        ugur.withdrawal(3214);
        ugur.withdrawal(106945);
        ugur.withdrawal(0);


    }
}
