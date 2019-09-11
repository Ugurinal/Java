import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int i = 1;

        while ((int) Math.pow(i, 2) <= number) {
            System.out.println((int) Math.pow(i, 2));
            i++;
        }
    }
}