/**
 * Created by UGURINAL
 * 8/15/2019
 * 11:40 PM
 */


public class House {
    private String color;
    private Size theSize;
    private Address theAddress;
    private BedRoom theBedRoom;

    public House(String color, Size theSize, Address theAddress, BedRoom theBedRoom) {
        this.color = color;
        this.theSize = theSize;
        this.theAddress = theAddress;
        this.theBedRoom = theBedRoom;
    }

    public String getColor() {
        return color;
    }

    public Size getTheSize() {
        return theSize;
    }

    public Address getTheAddress() {
        return theAddress;
    }

    public BedRoom getTheBedRoom() {
        return theBedRoom;
    }
}
