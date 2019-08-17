/**
 * Created by UGURINAL
 * on 8/17/2019
 * at 5:51 PM
 * Encapsulation
 */


public class Main {
    public static void main(String[] args) {
        Player ugur = new Player();
        ugur.name = "UGUR";
        ugur.health = 100;
        ugur.energy = 100;
        int damage = 20;

        ugur.loseHealth(damage);
        System.out.println("Remaining health = "+ugur.getHealth());
    }
}
