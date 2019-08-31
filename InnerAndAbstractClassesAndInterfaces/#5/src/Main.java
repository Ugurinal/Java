import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by UGURINAL
 * on 8/31/2019
 * at 02:26 AM
 * LinkedListChallenge
 */

public class Main {

    private static ArrayList<Album> albumArrayList = new ArrayList<>();


    public static void main(String[] args) {

        Album album1 = new Album("Kamikaze","Eminem");

        LinkedList<Song> playList =new LinkedList<>();

        albumArrayList.add(album1);

        album1.addSong("The Ringer",5.38);
        album1.addSong("Greatest",3.47);
        album1.addSong("Lucky You",4.05);
        album1.addSong("Normal",3.42);
        album1.addSong("Stepping Stone",5.10);
        album1.addSong("Not Alike",4.48);
        album1.addSong("Kamikaza",3.36);
        album1.addSong("Fall",4.22);

        albumArrayList.get(0).addToPlayList(1,playList);
        albumArrayList.get(0).addToPlayList(2,playList);
        albumArrayList.get(0).addToPlayList(3,playList);
        albumArrayList.get(0).addToPlayList(4,playList);
        albumArrayList.get(0).addToPlayList(5,playList);

        play(playList);

    }

        private static void play(LinkedList<Song> playList){

        Scanner myInput = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        int choice;
        ListIterator<Song> songListIterator = playList.listIterator();

            if(playList.size() == 0){
                System.out.println("No songs in playlist");
                return;
            } else {
                System.out.println("Now playing " +songListIterator.next().toString());
                printMenu();
            }

        while(!quit){
            choice = myInput.nextInt();
            myInput.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Playlist  complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(songListIterator.hasNext()){
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if(songListIterator.hasNext()){
                        System.out.println("Now playing " +songListIterator.next().toString());
                    } else{
                        System.out.println("You have reached the end of the list.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if(songListIterator.hasPrevious()){
                        System.out.println("Now playing " +songListIterator.previous().toString());
                    } else{
                        System.out.println("You are at the start of the list.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            System.out.println("Now replaying " +songListIterator.previous().toString());
                            forward = false;
                        } else{
                            System.out.println("You are the start of the playlist.");
                        }
                    } else{
                        if(songListIterator.hasNext()){
                            System.out.println("Now replaying " +songListIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("You have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    if(playList.size() > 0){
                        songListIterator.remove();
                    }
                    if(songListIterator.hasNext()){
                        System.out.println("Now playing " +songListIterator.next().toString());
                    } else if(songListIterator.hasPrevious()){
                        System.out.println("Now playing " +songListIterator.previous().toString());
                    }
                    break;
                case 5:
                    printList(playList);
                    break;
                default:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\n" +
                "0 - Quit\n" +
                "1 - Next song\n" +
                "2 - Previous song\n" +
                "3 - Replay the current song\n" +
                "4 - Remove song from playlist\n" +
                "5 - Print playlist\n" +
                "6-9 - Print menu\n");
    }

    private static void printList(LinkedList<Song> playList){
        ListIterator<Song> songListIterator = playList.listIterator();
        System.out.println("================================");
        if(playList.size() == 0){
            System.out.println("No songs in the playlist");
        } else{
            while(songListIterator.hasNext()){
                System.out.println(songListIterator.next().toString());
            }
        }
        System.out.println("================================");
    }
}
