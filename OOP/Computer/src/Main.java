/**
 * Created by UGURINAL
 * 8/15/2019
 * 6:22 PM
 */


public class Main {

    public static void main(String[] args) {

//        Dimensions dimensions = new Dimensions(20,40,15);
//        Case theCase = new Case("Abra A5 v12.1","MonsterNotebook","200",dimensions);
//        Resolution theResolution = new Resolution(3840,2160);
//        Monitor theMonitor = new Monitor("Asus ROG PG27UQ","Asus",27,theResolution);
//        Motherboard theMotherboard = new Motherboard("Asus ROG Rampage VI","Asus",8,2,"Bios v1.2");
//
//        Computer c1 = new Computer(theCase,theMonitor,theMotherboard);

//        The code below does the same thing as the code above...


        Computer c1 = new Computer(new Case("Abra A5 v12.1","MonsterNotebook","200",new Dimensions(20,40,15)),
                      new Monitor("Asus ROG PG27UQ","Asus",27, new Resolution(3840,2160)),
                      new Motherboard("Asus ROG Rampage VI","Asus",8,2,"Bios v1.2"));

        c1.getTheMonitor().drawPixelAt(15,36,"Blue");
        c1.getTheMotherboard().loadProgram("Windows 1.0");
        c1.getTheCase().pressPowerButton();

    }
}
