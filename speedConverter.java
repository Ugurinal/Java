public class Main {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;
        }

        return Math.round(kilometersPerHour/1.609);


    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            System.out.println(kilometersPerHour +" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");

        }
        else
            System.out.println("Invalid Value");
    }



    public static void main(String [] args){

        printConversion(13546.7);

    }
}
