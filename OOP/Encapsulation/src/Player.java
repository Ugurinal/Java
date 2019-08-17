/**
 * Created by UGURINAL
 * on 8/17/2019
 * at 6:00 PM
 * Encapsulation
 */


public class Player {
    public String name;
    public int health;
    public int energy;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player "+this.name+" knocked out.");
            //Reduce number of lives remaining for the player
        }
    }
    public int getHealth(){
        return health;
    }
}
