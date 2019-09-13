import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int first = 0;
        int second = 0;

        for (int i = 0; i < num.length(); i++) {
            if (i < 3) {
                first += num.charAt(i);
            } else {
                second += num.charAt(i);
            }
        }

        System.out.println(first == second ? "Lucky" : "Regular");

    }
}