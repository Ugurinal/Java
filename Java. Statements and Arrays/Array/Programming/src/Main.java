import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean test = false;       //test

        for (int i = 0; i < size - 1; i++) {

            if ((myArray[i] == n && myArray[i + 1] == m) || (myArray[i] == m && myArray[i + 1] == n)) {
                test = true;
                break;
            }

        }

        System.out.println(test ? "true" : "false");
    }
}