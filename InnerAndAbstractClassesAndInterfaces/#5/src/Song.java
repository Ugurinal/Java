/**
 * Created by UGURINAL
 * on 8/31/2019
 * at 02:27 AM
 * LinkedListChallenge
 */

public class Song {
    private String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + " : " +this.duration;
    }

}
