/**
 * Created by UGURINAL
 * 7/23/2019
 * 12:55 AM
 **/


public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setAge(21);
        p1.setFirstName("");
        p1.setLastName("");

        System.out.println("Full name = "+p1.getFullName());
        System.out.println("Teen = "+p1.isTeen());
        p1.setFirstName("UGUR");
        p1.setLastName("İNAL");
        System.out.println("Full name = "+p1.getFullName());
        System.out.println("Teen = "+p1.isTeen());

    }

}
