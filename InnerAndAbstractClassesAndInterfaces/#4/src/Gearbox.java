import java.util.ArrayList;

/**
 * @author UGURINAL
 * on 8/29/2019
 * at 9:35 PM
 * InnerClasses
 */


public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber = 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public class Gear{

    }

}
