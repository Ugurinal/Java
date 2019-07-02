public class Main {

    public static boolean areEqualByThreeDecimal(double num1, double num2){

        int newnum1 = (int) (num1 * 1000);
        int newnum2 = (int) (num2 * 1000);

        if(newnum1 == newnum2){
            return true;
        }

        return false;
    }


    public static void main(String [] args){

        System.out.println(areEqualByThreeDecimal(0.1598,0.1498));

    }
}
