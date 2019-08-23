import java.util.ArrayList;

/**
 * Created by UGURINAL
 * on 8/23/2019
 * at 9:27 PM
 * ArrayListChallangePart1
 */

public class MobilePhone {
    private String number;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String number){
        this.number = number;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }
            myContacts.add(contact);
            return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int findIndex = findContact(oldContact);
        if(findIndex < 0){
            System.out.println(oldContact.getName() +" was not found.");
            return false;
        }
        myContacts.set(findIndex, newContact);
        System.out.println(oldContact.getName() +" was replaced with " +newContact.getName() +".");
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) < 0){
            System.out.println(contact.getName() +" was not found.");
            return false;
        }
        myContacts.remove(findContact(contact.getName()));
        System.out.println(contact.getName() +" was deleted.");
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String ContactName){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(ContactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if(index < 0){
            return null;
        }
        return myContacts.get(index);
    }

    public void printContacts(){
        for (Contact myContact : myContacts) {
            System.out.println(myContact.getName() + " " +myContact.getSurname() +" - " +myContact.getPhoneNumber());
        }
    }

}
