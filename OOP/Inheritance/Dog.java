/**
 * Created by UGURINAL
 * 7/24/2019
 * 1:49 AM
 **/


public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //Constructor...
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    private void chew(){
        System.out.println("Dog.chew() called...");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() called...");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called...");
        move(5);
    }

    public void run(){
        System.out.println("Don.run() called...");
        move(20);
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called...");
        moveLegs(speed);
        super.move(speed);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called...");
    }
}
