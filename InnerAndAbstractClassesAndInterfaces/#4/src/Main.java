import java.util.Scanner;

/**
 * @author UGURINAL
 * on 8/29/2019
 * at 9:32 PM
 * InnerClasses
 */

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Button myButton = new Button("Print");

    public static void main(String[] args) {

//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));

//        class ClickListener implements Button.OnClickListener{                    LOCAL CLASS
//            public ClickListener(){
//                System.out.println("I've been attached.");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked.");
//            }
//        }
//
//        myButton.setOnClickListener(new ClickListener());

        myButton.setOnClickListener(new Button.OnClickListener() {          // Ananoymus class
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });

        listen();


    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    myButton.buttonOnClick();
                    break;
            }
        }
    }

}
