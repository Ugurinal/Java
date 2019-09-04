import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = 0;
        int reverse = number;

        if( number >= 100 && number < 1000){
            String s = "0" + number;
            while(Integer.valueOf(s) > 0 ){
                temp *= 10;
                temp += number % 10;
                number /= 10;
            }
            if(temp == reverse){
                System.out.println(1);
            } else {
                System.out.println(37);
            }
        }

        if( number >= 1000 && number <= 9999) {
            while( number > 0 ){
                temp *= 10;
                temp += number % 10;
                number /= 10;
            }
            if( temp == reverse){
                System.out.println(1);
            } else {
                System.out.println(37);
            }
        }

    }
}