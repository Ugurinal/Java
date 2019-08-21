/**
 * Created by UGURINAL
 * 8/17/2019
 * 4:14 PM
 */


public class BedRoom extends Room {
    private Bed theBed;
    private Lamp theLamp;

    public BedRoom(String name,Size theSize, Wall wall0, Wall wall1, Wall wall2, Wall wall3, Ceiling theCeiling, Bed theBed, Lamp theLamp) {
        super(name, theSize, wall0, wall1, wall2, wall3, theCeiling);
        this.theBed = theBed;
        this.theLamp = theLamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making bed...");
        theBed.make();
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Lamp getTheLamp() {
        return theLamp;
    }

}
