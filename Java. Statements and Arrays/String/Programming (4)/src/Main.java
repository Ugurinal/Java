import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int counter = 0;
        char temp = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            if (temp == text.charAt(i)) {
                counter++;
            } else {
                System.out.print(temp);
                System.out.print(counter);
                temp = text.charAt(i);
                counter = 1;
            }
        }

        System.out.print(temp);
        System.out.print(counter);
    }
}