public class Main {

    public static int sumDigits(int number){

        if(number >= 0){
            int sumOfDigits = 0;
            int digit = 0;

            while(number > 0){

                digit = number % 10;
                sumOfDigits += digit;
                number = number / 10;
            }
            return sumOfDigits;

        }

        return -1;
    }


    public static void main(String[] args){

        System.out.println(sumDigits(123456789));

    }
}

