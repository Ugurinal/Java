/**
 * @author UGURINAL
 * on 10/21/2019
 * on 7:57 PM
 * on Generics
 */

public class Main {
    public static void main(String[] args) {

        Team<FootballPlayer> footballTeam = new Team<>("GALATASARAY");
        Team<FootballPlayer> footballTeam2 = new Team<>("Another");
        Team<BasketballPlayer> basketballTeam = new Team<>("NewYork Knicks");
        Team<VolleyballPlayer> volleyballballTeam = new Team<>("Vakıfbank");

        FootballPlayer emreMor = new FootballPlayer("Emre Mor");
        FootballPlayer rodrigues = new FootballPlayer("Garry Rodrigues");
        BasketballPlayer cedi = new BasketballPlayer("Cedi Osman");

        footballTeam.addPlayer(emreMor);
//        footballTeam.addPlayer(cedi);   does not work
        footballTeam2.addPlayer(rodrigues);
        footballTeam.numPlayers();
        footballTeam2.numPlayers();

        footballTeam.matchResult(footballTeam2, 7, 0);
        footballTeam.matchResult(footballTeam2, 4, 0);
        footballTeam.matchResult(footballTeam2, 2, 1);

        System.out.println(footballTeam.getName() + " has " + footballTeam.calcPoints() + " points.");
        System.out.println(footballTeam2.getName() + " has " + footballTeam2.calcPoints() + " points.");

        System.out.println(footballTeam.compareTo(footballTeam2));
        System.out.println(footballTeam2.compareTo(footballTeam));

//        footballTeam.matchResult(basketballTeam,5,4);  does not work


    }
}
