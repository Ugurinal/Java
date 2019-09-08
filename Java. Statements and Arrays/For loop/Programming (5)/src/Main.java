import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();

            if (score == 2) {
                aCounter++;
            } else if (score == 3) {
                bCounter++;
            } else if (score == 4) {
                cCounter++;
            } else if (score == 5) {
                dCounter++;
            }
        }
        System.out.println(aCounter + " " + bCounter + " " + cCounter + " " + dCounter);
    }
}