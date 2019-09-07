import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();
        int element = 0;
        int maxNumber = 0;

        for (int i = 0; i < numOfElements; i++) {
            element = scanner.nextInt();
            if (element % 4 == 0 && element > maxNumber) {
                maxNumber = element;
            }
        }
        System.out.println(maxNumber);
    }
}