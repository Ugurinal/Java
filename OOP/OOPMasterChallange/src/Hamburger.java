/**
 * Created by UGURINAL
 * on 18.08.2019
 * at 23:11
 * OOPMasterChallange
 */


public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        System.out.println(this.name+" hamburger on a "+this.breadRollType+" roll with "+this.meat +". Price is "+this.price+"$");
        if(addition1Name != null){
            totalPrice += this.addition1Price;
            System.out.println("Added "+this.addition1Name+ "  for an extra "+this.addition1Price+"$. New price is "+totalPrice+"$");
        }
        if(addition2Name != null){
            totalPrice += this.addition2Price;
            System.out.println("Added "+this.addition2Name+ "  for an extra "+this.addition2Price+"$. New price is "+totalPrice+"$");
        }
        if(addition3Name != null){
            totalPrice += this.addition3Price;
            System.out.println("Added "+this.addition3Name+ "  for an extra "+this.addition3Price+"$. New price is "+totalPrice+"$");
        }
        if(addition4Name != null){
            totalPrice += this.addition4Price;
            System.out.println("Added "+this.addition4Name+ "  for an extra "+this.addition4Price+"$. New price is "+totalPrice+"$");
        }
        return totalPrice;
    }

}
