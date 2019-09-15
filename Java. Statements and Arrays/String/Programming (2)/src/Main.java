import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - (i + 1))) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "yes" : "no");
    }
}