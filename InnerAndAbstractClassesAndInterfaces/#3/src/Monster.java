import java.util.ArrayList;
import java.util.List;

/**
 * @author UGURINAL
 * on 8/29/2019
 * at 5:37 PM
 * InterfaceChallenge
 */

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0, name);
        values.add(1, "" + hitPoints);
        values.add(2, "" + strength);

        return values;
    }

    @Override
    public void read(List<String> savedValue) {
        if(savedValue != null && savedValue.size() > 0){
            name = savedValue.get(0);
            hitPoints = Integer.parseInt(savedValue.get(1));
            strength = Integer.parseInt(savedValue.get(2));
        }
    }
}
