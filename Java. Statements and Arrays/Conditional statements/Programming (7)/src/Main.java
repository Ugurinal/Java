import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        if (((k % n == 0) || (k % m == 0)) && (m * n > k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}