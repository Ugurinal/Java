import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.toLowerCase();
        double counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'g' || text.charAt(i) == 'c') {
                counter++;
            }
        }

        System.out.println((counter / text.length()) * 100);
    }
}