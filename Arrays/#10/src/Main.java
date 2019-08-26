import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by UGURINAL
 * on 8/25/2019
 * at 8:44 PM
 * LinkedList
 */

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();


        addInOrder(placesToVisit,"Istanbul");
        addInOrder(placesToVisit, "Ankara");
        addInOrder(placesToVisit, "Erzincan");
        addInOrder(placesToVisit, "Malatya");
        addInOrder(placesToVisit, "Bayburt");
        addInOrder(placesToVisit, "Akhisar");
        addInOrder(placesToVisit, "Edirne");
        addInOrder(placesToVisit, "Konya");
        addInOrder(placesToVisit, "Mersin");
        addInOrder(placesToVisit, "Antalya");
        addInOrder(placesToVisit, "Afyon");
        addInOrder(placesToVisit, "Mardin");
        addInOrder(placesToVisit, "Diyarbakır");
        addInOrder(placesToVisit, "Denizli");

        visit(placesToVisit);


    }

    private static void printList(LinkedList<String> myList){
        Iterator<String> iterator = myList.iterator();

        while(iterator.hasNext()){
            System.out.println("Now visiting " + iterator.next());
        }
    }

    private static boolean addInOrder(LinkedList<String> myList, String name){
        ListIterator<String> myListIterator = myList.listIterator();
        while(myListIterator.hasNext()){
            int comparison = myListIterator.next().compareTo(name);
            if(comparison == 0){
                System.out.println(name +" already exists on list.");
                return false;
            } else if(comparison > 0 ){
                myListIterator.previous();
                myListIterator.add(name);
                return true;
            }
        }
        myListIterator.add(name);
        return true;
    }

    private static void visit(LinkedList<String> myList){
        ListIterator<String> listIterator = myList.listIterator();
        if(myList.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }else{
            System.out.println("Now visiting " +listIterator.next());
            printMenu();
        }

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        int choice;
        boolean goingForward = true;

        while(!quit){
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Holiday (Vacation) is over.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " +listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " +listIterator.previous());
                    } else{
                        System.out.println("You are at the start of the list.");
                        goingForward = true;
                    }
                    break;
                default:
                    printMenu();
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\n" +
                "0 - Quit\n" +
                "1 - Go to next city\n" +
                "2 - Go to previous city\n" +
                "3-9 - Print menu.");
    }
}
