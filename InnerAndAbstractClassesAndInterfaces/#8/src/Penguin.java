/**
 * @author UGURINAL
 * on 10/16/2019
 * at 7:07 PM
 * AbstractClasses
 */

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not good at that, can I go for a swim instead of that?");
    }
}
