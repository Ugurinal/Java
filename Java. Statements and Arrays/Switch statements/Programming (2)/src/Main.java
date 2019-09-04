import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n1 = input.nextLong();
        char operator = input.next().charAt(0);
        long n2 = input.nextLong();

        switch (operator) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                ;
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(n1 / n2);
                }
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}