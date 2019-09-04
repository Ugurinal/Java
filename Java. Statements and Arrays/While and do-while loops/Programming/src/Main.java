import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        while (input.nextInt() != 0) {
            counter++;
        }
        System.out.println(counter);

    }
}