/**
 * Created by UGURINAL
 * on 8/21/2019
 * at 10:24 PM
 * ReverseArrayChallange
 */

public class Main {
    public static void main(String[] args) {

        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverseArray(myArray);

        for(int value : myArray){
            System.out.println(value);
        }

    }

    private static void reverseArray(int[] myArray){
        int temp;
        int maxIndex = myArray.length - 1;
        int halfIndex = myArray.length / 2;

        for(int i = 0; i < halfIndex; i++){
            temp = myArray[i];
            myArray[i] = myArray[maxIndex - i];
            myArray[maxIndex - i] = temp;
        }
    }
}
