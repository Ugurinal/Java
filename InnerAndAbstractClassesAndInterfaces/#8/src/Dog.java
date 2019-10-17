/**
 * @author UGURINAL
 * on 10/16/2019
 * at 6:44 PM
 * AbstractClasses
 */

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing.");
    }
}
