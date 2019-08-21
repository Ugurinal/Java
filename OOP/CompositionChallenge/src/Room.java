/**
 * Created by UGURINAL
 * 8/15/2019
 * 11:54 PM
 */


public class Room {
    private String name;
    private Size theSize;
    private Wall wall0;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Ceiling theCeiling;

    public Room(String name,Size theSize, Wall wall0, Wall wall1, Wall wall2, Wall wall3, Ceiling theCeiling) {
        this.name = name;
        this.theSize = theSize;
        this.wall0 = wall0;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.theCeiling = theCeiling;
    }

    public String getName() {
        return name;
    }

    public Size getTheSize() {
        return theSize;
    }

    public Wall getWall0() {
        return wall0;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Ceiling getTheCeiling() {
        return theCeiling;
    }
}
