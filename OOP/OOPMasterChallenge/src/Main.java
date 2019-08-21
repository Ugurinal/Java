/**
 * Created by UGURINAL
 * on 18.08.2019
 * at 23:10
 * OOPMasterChallange
 */


public class Main {
    public static void main(String[] args) {
        Hamburger h1 = new Hamburger("Basic","Beef","White",3.56);
        h1.itemizeHamburger();
        h1.addAddition1("Tomato",0.56);
        h1.itemizeHamburger();
        System.out.println();

        HealtyBurger h2 = new HealtyBurger("Beef",5.69);
        h2.addHealtyAddition1("Egg",2.3);
        h2.itemizeHamburger();
        System.out.println();

        DeluxeBurger h3 = new DeluxeBurger();
        h3.itemizeHamburger();
        h3.addAddition1("Lettuce",4.50);
    }
}
