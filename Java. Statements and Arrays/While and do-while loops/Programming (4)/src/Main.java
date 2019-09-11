import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        int i = 1;
        while (findFactorial(i) < num) {
            i++;
        }
        System.out.println(i);
    }

    private static int findFactorial(int num) {
        int result = 1;
        for (int j = num; j > 0; j--) {
            result = result * j;
        }
        return result;
    }
}