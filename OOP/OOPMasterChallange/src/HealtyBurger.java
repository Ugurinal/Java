/**
 * Created by UGURINAL
 * on 18.08.2019
 * at 23:41
 * OOPMasterChallange
 */


public class HealtyBurger extends Hamburger {
    private String healtyAddition1Name;
    private double healtyAddition1Price;
    private String healtyAddition2Name;
    private double healtyAddition2Price;

    public HealtyBurger(String meat, double price){
        super("HealtyBurger",meat,"Brown rye",price);
    }

    public void addHealtyAddition1(String name, double price){
        this.healtyAddition1Name = name;
        this.healtyAddition1Price = price;
    }

    public void addHealtyAddition2(String name, double price){
        this.healtyAddition2Name = name;
        this.healtyAddition2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if(healtyAddition1Name != null){
            totalPrice += this.healtyAddition1Price;
            System.out.println(this.healtyAddition1Name+" added for an extra "+this.healtyAddition1Price+"$. New price is "+totalPrice+"$");
        }
        if(healtyAddition2Name != null){
            totalPrice += this.healtyAddition2Price;
            System.out.println(this.healtyAddition2Name+" added for an extra "+this.healtyAddition2Price+"$. New price is "+totalPrice+"$");
        }
        return totalPrice;
    }
}
