/**
 * @author UGURINAL
 * on 9/5/2019
 * at 5:10 PM
 * AbstractClasses
 */

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Garip");

        Animal test = new Dog("test");

        dog.eat();
        test.breathe();

        System.out.println(dog.getName());
        System.out.println(test.getName());

        Parrot parrot = new Parrot("Maviş");

        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");

        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
