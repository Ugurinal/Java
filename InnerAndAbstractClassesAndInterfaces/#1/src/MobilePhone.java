/**
 * Created by UGURINAL
 * on 8/28/2019
 * at 11:20 PM
 * Interfaces
 */

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isOn;
    private boolean isRinging;

    public MobilePhone(int myNumber) {
        this.isOn = false;
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " on mobile phone." );
        } else{
            System.out.println("Phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering mobile phone");
            isRinging = false;
        } else{
            System.out.println("Mobile phone is not ringing.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring...");
        } else if(isOn){
            System.out.println("Mobile phone is not on or number is different.");
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
