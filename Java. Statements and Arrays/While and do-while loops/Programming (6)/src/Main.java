import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean first = true;

        while (num != 1) {
            if (num % 2 == 0) {
                if (first) {
                    System.out.println(num + " ");
                    first = false;
                } else {
                    num = (int) (num / 2);
                    System.out.print(num + " ");
                }
            } else {
                if (first) {
                    System.out.println(num + " ");
                    first = false;
                } else {
                    num = (int) (num * 3) + 1;
                    System.out.print(num + " ");
                }
            }
        }
    }
}