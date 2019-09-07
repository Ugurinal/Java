import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numOfElement = scanner.nextInt();
        int element = 0;

        for (int i = 0; i < numOfElement; i++) {
            element = scanner.nextInt();

            if (element % 6 == 0) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}