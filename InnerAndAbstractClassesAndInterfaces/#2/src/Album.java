import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by UGURINAL
 * on 8/27/2019
 * at 12:38 AM
 * LinkedListChallenge
 */

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public boolean addSong(String name, double duration){
        if(findSong(name) == null){
            this.songList.add(new Song(name, duration));
            System.out.println(name +" added to album.");
            return true;
        }
        System.out.println(name +" already exists in the album.");
        return false;

    }

    private Song findSong(String name){
        for (Song checkedSong : this.songList) {
            if (checkedSong.getName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(String name, LinkedList<Song> playList){
        Song checkedSong = findSong(name);
        if(checkedSong == null){
            System.out.println(name +" does not exist.");
            return false;
        }
        playList.add(checkedSong);
        System.out.println(name +" added to playlist.");
        return true;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songList.size())){
            playList.add(this.songList.get(index));
            System.out.println(this.songList.get(index).getName() +" added to playlist.");
            return true;
        }
        System.out.println("This album does not have a track " +trackNumber);
        return false;
    }
}
