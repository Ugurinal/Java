public class Main {

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if(playerScore >=1000){
            position = 1;
        }else if((playerScore >= 500) && playerScore < 1000){
            position = 2;
        }else if((playerScore >=100) && (playerScore < 500)){
            position = 3;
        }
        return position;

//        if(playerScore >=1000){
//            return 1;
//        }else if((playerScore >= 500) && playerScore < 1000){
//            return 2;
//        }else if((playerScore >=100) && (playerScore < 500)){
//            return 3;
//        }else{
//            return 4;
//        }

    }

        public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " is managed to get into position "+position +" on the high score table.");


    }

    public static boolean areEqualByThreeDecimal(double num1, double num2){

        int newnum1 = (int) (num1 * 1000);
        int newnum2 = (int) (num2 * 1000);
        
        return (newnum1 == newnum2);
    }

    public static boolean hasEqualSum(int n1,int n2, int sum){

        return (n1+n2) == sum;
    }

    private static boolean hasTeen(int n1, int n2, int n3){

        return ( isTeen(n1) || isTeen(n2) || isTeen(n3) );
    }

    private static boolean isTeen(int age){

        return age>=13 && age<=19;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet <0) || ((inches <0) || (inches >12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static String getDurationString(int min, int sec){
        if(min >=0 && sec >= 0  ){

            int fmin = min; int fsec = sec;

            min+= sec/60;
            sec = sec %60;
            int hours = min/60;
            min = min %60;

            return ( +fmin +" minutes and "+fsec+" seconds is equal to "+hours+" hours, "+min+" minutes and "+sec +" seconds" );
        }

        return "Invalid value";
    }

    public static double area(double radius){
        if(radius <0){
            return -1;
        }

        return Math.PI * radius * radius;
    }

    public static double area(double e1, double e2){
        if(e1 < 0 || e2<0){
            return -1;
        }
        return e1 * e2;
    }
    public static void printYearsAndDays(long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");


        }else {

            int days = (int) minutes / 1440;
            int remainingMinutes = (int) minutes % 1440;
            int years = days / 365;
            int remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void printEqual(int n1, int n2, int n3){
        if(n1 < 0 || n2 < 0 || n3 < 0 ){
            System.out.println("Invalid Value");
        }else if(n1==n2 && n1 == n3){
            System.out.println("All numbers are equal");

            }else if( n1 != n2 && n2 != n3 && n1 != n3){
            System.out.println("All numbers are different");

        }else
            System.out.println("Neither all are equal or different");


    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {

            return (temperature >= 25 && temperature <= 45);

        } else {
            return (temperature >= 25 && temperature <= 35);
        }

    }
    public static void main(String [] args) {
        

    }
}

