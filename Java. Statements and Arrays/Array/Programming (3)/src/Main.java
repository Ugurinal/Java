import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] myArray = new int[size];
        int[] copyA;

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        copyA = myArray.clone();

        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                myArray[i + 1] = copyA[i];
            } else {
                myArray[0] = copyA[i];
            }
        }

        for (int i : myArray) {
            System.out.print(i + " ");
        }

    }
}