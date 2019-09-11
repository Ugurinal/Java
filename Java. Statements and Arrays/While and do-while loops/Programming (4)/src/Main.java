import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long num = scanner.nextLong();

    long i = 0;
    long fact = 1;

    while(fact <= num) {
      i++;
      fact = fact * i;
      if(fact > num){
        System.out.println(i);
      }
    }
  }


}