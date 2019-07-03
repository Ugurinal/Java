public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet >=0 && inches>=0 ){

            double centimeters = (12*2.54*feet) + (2.54*inches);
            System.out.println(feet+" feet, "+inches+" inches equal to "+centimeters+" centimeters");
            return centimeters;

        }
        System.out.println("Invalid inputs");
        return -1;
    }


    public static void main(String [] args){

        calcFeetAndInchesToCentimeters(6,-1);

    }
}
