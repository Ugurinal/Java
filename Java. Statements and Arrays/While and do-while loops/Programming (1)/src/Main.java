import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        int userNum = 0;
        int max = 0;

        while (count != 0) {
            userNum = input.nextInt();
            if (userNum % 4 == 0 && userNum > max) {
                max = userNum;
            }
            count--;
        }
        System.out.println(max);
    }
}