/**
 * Created by UGURINAL
 * on 8/23/2019
 * at 9:27 PM
 * ArrayListChallangePart1
 */

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;

    public Contact(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String surName, String phoneNumber){
        return new Contact(name, surName, phoneNumber);
    }
}
