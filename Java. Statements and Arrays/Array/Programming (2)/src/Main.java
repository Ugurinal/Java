import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        int sum = myArray[0];       // if it is 1 element

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                if ((myArray[i] * myArray[j]) > sum) {
                    sum = myArray[i] * myArray[j];
                }
            }
        }
        System.out.println(sum);
    }
}