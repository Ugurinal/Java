/**
 * Created by UGURINAL
 * 7/21/2019
 * 10:51 PM
 **/

public class Main {

    public static void main(String[] args){

        Car porsche = new Car();


       porsche.setDoors(2);
       porsche.setWheels(4);
       porsche.setModel("Carrera");
       porsche.setEngine("V10");
       porsche.setColour("Black");

       System.out.println(porsche.getModel()+" has "+porsche.getDoors()+" doors, "+porsche.getWheels()+" wheels, "
               +porsche.getEngine()+" engine and coloured "+porsche.getColour()+"..." );

    }

}
