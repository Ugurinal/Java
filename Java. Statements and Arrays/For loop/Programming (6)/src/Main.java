import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (; a <= b; a++) {
            if (a % 15 == 0) {
                System.out.println(a);
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println(a);
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println(a);
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
        }

    }
}