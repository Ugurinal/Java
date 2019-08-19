/**
 * Created by UGURINAL
 * on 19.08.2019
 * at 00:09
 * OOPMasterChallange
 */


public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("DeluxeBurger", "Sausage & Bacon", "White", 10.0);
        super.addAddition1("Drink",3.5);
        super.addAddition2("Chips",3.0);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("You can not add extra items to deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("You can not add extra items to deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("You can not add extra items to deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("You can not add extra items to deluxe burger");
    }
}
