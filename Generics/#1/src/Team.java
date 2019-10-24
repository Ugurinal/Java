import java.util.ArrayList;

/**
 * @author UGURINAL
 * on 10/21/2019
 * on 9:47 PM
 * on Generics
 */

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> member = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (member.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            member.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        System.out.println(this.name + " has " + member.size() + " players.");
        return this.member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int oppScore) {
        if (ourScore > oppScore) {
            won++;
        } else if (oppScore > ourScore) {
            lost++;
        } else {
            tied++;
        }
        played++;

        if (opponent != null) {
            opponent.matchResult(null, oppScore, ourScore);
        }
    }

    public int calcPoints() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.calcPoints() > team.calcPoints()) {
            return -1;
        }
        if (this.calcPoints() < team.calcPoints()) {
            return 1;
        }
        return 0;
    }
}

