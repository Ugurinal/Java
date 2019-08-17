/**
 * Created by UGURINAL
 * 8/17/2019
 * 4:22 PM
 */


public class Lamp {
    private String type;
    private String color;
    private int price;

    public Lamp(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on...");
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }


}
