import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(num + " ");

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print(num + " ");
            } else {
                num = (num * 3) + 1;
                System.out.print(num + " ");
            }
        }
    }
}