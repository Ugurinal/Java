import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int times = scanner.nextInt();
    int i = 0;
    while (times > 0){
      i++;
      int j = i;
      while( j > 0){
        System.out.print(i+" ");
        j--;
        times--;
      }
    }
  }
}