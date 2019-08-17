/**
 * Created by UGURINAL
 * 8/15/2019
 * 11:39 PM
 */


public class Main {
    public static void main(String[] args) {

        String color = "blue";
        Size houseSize = new Size(20,30,40);
        Address theAddress = new Address("Ev","Turkey","Adana","Gülbahçesi","Seyhan","01010");
        Size bedRoomSize = new Size(3,3,3);
        Size theBedSize = new Size(1,2,0.5);
        Wall bedRoomWall0 = new Wall("North");
        Wall bedRoomWall1 = new Wall("East");
        Wall bedRoomWall2 = new Wall("West");
        Wall bedRoomWall3 = new Wall("South");
        Ceiling bedRoomCeiling = new Ceiling(3,"Blue");
        Bed theBed = new Bed("White",theBedSize,3,2);
        Lamp bedRoomLamp = new Lamp("Desk Lamp","White",30);
        BedRoom theBedRoom = new BedRoom("BedRoom",bedRoomSize,bedRoomWall0,bedRoomWall1,bedRoomWall2,bedRoomWall3,bedRoomCeiling,theBed,bedRoomLamp);

        House house1 = new House(color,houseSize,theAddress,theBedRoom);
        house1.getTheBedRoom().makeBed();
        house1.getTheBedRoom().getTheLamp().turnOn();

//        theBedRoom.makeBed();


    }
}
