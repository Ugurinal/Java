/**
 * Created by UGURINAL
 * 8/14/2019
 * 8:50 PM
 */


public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelarate(int rate){

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0){
            stop();
            setCurrentGear(1);
        } else if(newVelocity > 0  && newVelocity <= 10){
            setCurrentGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            setCurrentGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        } else if(newVelocity > 30 && newVelocity <= 40){
            setCurrentGear(4);
        } else if(newVelocity > 40 && newVelocity <= 50 ){
            setCurrentGear(5);
        } else if(newVelocity > 50){
            setCurrentGear(6);
        }

        if(newVelocity >= 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }

    }
}
