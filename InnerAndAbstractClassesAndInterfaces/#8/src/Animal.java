/**
 * @author UGURINAL
 * on 10/16/2019
 * at 6:39 PM
 * AbstractClasses
 */

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
