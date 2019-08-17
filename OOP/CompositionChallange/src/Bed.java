/**
 * Created by UGURINAL
 * 8/17/2019
 * 4:21 PM
 */


public class Bed {
    private String color;
    private Size theSize;
    private int pillows;
    private int quilts;

    public Bed(String color, Size theSize, int pillows, int quilts) {
        this.color = color;
        this.theSize = theSize;
        this.pillows = pillows;
        this.quilts = quilts;
    }

    public void make() {
        System.out.println("Bed -> Making...");
    }

    public String getColor() {
        return color;
    }

    public Size getTheSize() {
        return theSize;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }
}
