import java.util.Scanner;

/**
 * Created by UGURINAL
 * on 8/23/2019
 * at 9:26 PM
 * ArrayListChallangePart1
 */

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("0354 120 00 00 99");

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("Enter action: (6 to show available actions)");
            choice = input.nextInt();
            input.nextLine();   // Remove \n from buffer

            switch (choice){
                case 0:
                    shutdown();
                    quit = true;
                    break;
                case 1:
                    System.out.println("Contact List:");
                    myPhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Invalid choice!");

            }

        }
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void shutdown(){
        System.out.println("Turning phone off...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - To shutdown\n" +
                "1 - To print contacts\n" +
                "2 - To add new contact\n" +
                "3 - To update an existing contact\n" +
                "4 - To remove a contact\n" +
                "5 - Query existing contact\n" +
                "6 - To print available actions\n");
        System.out.println("Choose your actions: ");
    }

    private static void addContact(){
        String name;
        String surName;
        String phoneNumber;
        Contact contact;

        System.out.println("Enter name:");
        name = input.nextLine();
        System.out.println("Enter surname");
        surName = input.nextLine();
        System.out.println("Enter phone number");
        phoneNumber = input.nextLine();
        contact = Contact.createContact(name, surName, phoneNumber);

        if(myPhone.addNewContact(contact)){
            System.out.println("New contact added: " +name +" " +phoneNumber);
        } else{
            System.out.println("Can not add, " +name +" already on file.");
        }

    }

    private static void updateContact(){
        System.out.println("Enter the contact name you want to modify?");
        String name = input.nextLine();
        Contact oldContact = myPhone.queryContact(name);
        if(oldContact != null){
            System.out.println("Enter new name");
            name = input.nextLine();
            System.out.println("Enter surname");
            String surname = input.nextLine();
            System.out.println("Enter new phone number");
            String phoneNumber = input.nextLine();
            Contact newContact = Contact.createContact(name, surname, phoneNumber);
                myPhone.updateContact(oldContact, newContact);
        } else{
            System.out.println(name +" does not exist.");
        }
    }

    private static void removeContact(){
        System.out.println("Enter the name you want to remove:");
        String name = input.nextLine();
        if(myPhone.queryContact(name) != null){
            myPhone.removeContact(myPhone.queryContact(name));
        } else{
            System.out.println(name+ " does not exist.");
        }

    }

    private static void queryContact(){
        System.out.println("Enter the name you want to query:");
        String name = input.nextLine();
        if(myPhone.queryContact(name) != null){
            System.out.println(name +" "+myPhone.queryContact(name).getSurname()+" " +myPhone.queryContact(name).getPhoneNumber() +" exists in your contact.");
        } else{
            System.out.println(name +" does not exist.");
        }
    }

}
