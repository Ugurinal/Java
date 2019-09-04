import java.util.Scanner;

/**
 * @author UGURINAL
 * on 9/4/2019
 * at 6:15 PM
 * test
 */

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int max = 0;
        int userNum;

        while(sum <= 1000){
            userNum = input.nextInt();
            input.nextLine();
            sum += userNum;

            if( userNum % 4 == 0 && userNum > max){
                max = userNum;
            }
        }
        System.out.println(max);

    }
}
