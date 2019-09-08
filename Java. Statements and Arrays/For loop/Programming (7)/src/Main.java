import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int lCounter = 0;
        int sCounter = 0;
        int pCounter = 0;
        int num = 0;

        for (int i = 0; i < size; i++) {
            num = scanner.nextInt();
            if (num == 1) {
                lCounter++;
            } else if (num == -1) {
                sCounter++;
            } else if (num == 0) {
                pCounter++;
            }
        }
        System.out.println(pCounter + " " + lCounter + " " + sCounter);
    }
}