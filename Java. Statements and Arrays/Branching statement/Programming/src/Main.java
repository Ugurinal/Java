import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }
}