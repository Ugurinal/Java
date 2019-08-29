/**
 * @author UGURINAL
 * on 8/29/2019
 * at 9:32 PM
 * InnerClasses
 */

public class Main {
    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.3);

        System.out.println(first.driveSpeed(1000));

    }

}
