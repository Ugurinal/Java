import java.util.Scanner;

/**
 * Created by UGURINAL
 * on 8/22/2019
 * at 11:18 PM
 * ListAndArrayList
 */

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static GroceryList myList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        printInstructions();
        System.out.println();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    modifyList();
                    break;
                case 3:
                    findItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    myList.printGroceryList();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        }


    }

    private static void printInstructions(){

        System.out.println(
                "\n0 - Print instructions" +
                "\n1 - Add item" +
                "\n2 - Modify your list" +
                "\n3 - Find item" +
                "\n4 - Remove item" +
                "\n5 - Print yor list" +
                "\n6 - Quit.");
    }

    private static void addItem(){
        String item;
        System.out.println("Enter the item you want to add in your grocery list.");
        item = input.nextLine();
        myList.addGroceryItem(item);
        System.out.println("Item added into your list successfully.");
    }

    private static void modifyList(){
        int index;
        String newItem;
        myList.printGroceryList();
        System.out.println("Enter the index of item you want to modify: ");
        index = input.nextInt();
        input.nextLine();
        System.out.println("Enter new item");
        newItem = input.nextLine();
        myList.modifyGroceryItem(index, newItem);

    }

    private static void findItem(){
        String searchItem;

        System.out.println("Enter the item you want to search:");
        searchItem = input.nextLine();
        if(myList.findItem(searchItem) != null){
            System.out.println("You have " +myList.findItem(searchItem) +" in your list.");
        } else{
            System.out.println("Item " +searchItem +" not founded.");
        }
    }

    private static void removeItem(){
        int index;
        System.out.println("Enter the index of item you want to remove:");
        index = input.nextInt();
        myList.removeItem(index);
    }
}
