import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

//        while( (input = scanner.nextInt()) != 0) {
//          sum += input;
//        }

        System.out.println(sum);
    }
}