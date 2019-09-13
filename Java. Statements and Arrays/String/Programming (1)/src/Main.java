import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] strings = text.split(" ");
        int idx = 0;
        int length = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > length) {
                length = strings[i].length();
                idx = i;
            }
        }

        System.out.println(strings[idx]);
    }
}