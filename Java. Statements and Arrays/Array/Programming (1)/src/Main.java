import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idx = 0;
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (myArray[idx] < myArray[i]) {
                idx = i;
            }
        }
        System.out.println(idx);
    }
}