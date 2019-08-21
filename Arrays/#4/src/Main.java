import java.util.Scanner;

/**
 * Created by UGURINAL
 * on 8/21/2019
 * at 9:08 PM
 * MinElementChallange
 */

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int length;
        int[] myArray;

        System.out.println("How many integers you are going to enter?");
        length = input.nextInt();
        myArray = readIntegers(length);
        System.out.println(findMin(myArray));

    }

    private static int[] readIntegers(int length){
        int[] myArray = new int[length];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] myArray){
        int minIdx = 0;
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] < myArray[minIdx]){
                minIdx = i;
            }
        }
        return myArray[minIdx];
    }
}
