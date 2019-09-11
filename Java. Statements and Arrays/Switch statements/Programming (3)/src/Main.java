import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String shape = input.nextLine();
        input.nextLine();

        switch (shape) {
            case "triangle":
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();

                double u = (a + b + c) / 2;
                double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
              System.out.println(area);
              break;
          case "rectangle":
            double a1 = input.nextDouble();
            double b1 = input.nextDouble();
            System.out.println(a1 * b1);
            break;
          case "circle":
            double r = input.nextDouble();
            System.out.println(3.14 * Math.pow(r , 2));
            break;
          default:
            System.out.println("Error!");
        }
    }
}