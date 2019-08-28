/**
 * Created by UGURINAL
 * on 8/28/2019
 * at 10:58 PM
 * Interfaces
 */

public class Main {
    public static void main(String[] args) {

        ITelephone ugursPhone;
//        DeskPhone ugursPhone;     same as above
        ugursPhone = new DeskPhone(123456);

        ugursPhone.powerOn();
        ugursPhone.answer();
        ugursPhone.callPhone(123456);
        ugursPhone.answer();

        ugursPhone = new MobilePhone(123456);
        ugursPhone.callPhone(123456);
        ugursPhone.answer();

        ugursPhone.powerOn();
        ugursPhone.callPhone(123456);
        ugursPhone.answer();

    }
}
