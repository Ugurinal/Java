public class Main {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){

        if( barking && ((hourOfDay > 22 && hourOfDay <25 ) || (hourOfDay < 8 && hourOfDay >=0)) ){

            return true;
        }
        else
            return false;


    }



    public static void main(String [] args){

        System.out.println(shouldWakeUp(true,4));

    }
}
