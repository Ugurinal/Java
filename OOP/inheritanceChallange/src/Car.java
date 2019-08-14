/**
 * Created by UGURINAL
 * 8/14/2019
 * 6:00 PM
 */


public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(){
        this("Unknown","Unknown",0,0,0,false);
    }

    public Car(String name,String size, int wheels, int doors, int gears, boolean isManual){
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear changed to "+this.currentGear+" gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity "+ speed+" direction "+ direction);
        move(speed, direction);
    }



}
