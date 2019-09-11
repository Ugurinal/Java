import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int sum = 0;
    int max = 0;
    int userNum;

    while(sum <= 1000){
      userNum = input.nextInt();
      input.nextLine();
      sum += userNum;

      if( userNum % 4 == 0 && userNum > max){
        max = userNum;
      }
    }
    System.out.println(max);

  }
}