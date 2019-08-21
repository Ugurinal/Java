import java.util.Arrays;

/**
 * Created by UGURINAL
 * on 8/21/2019
 * at 4:31 PM
 * #2
 */

public class Main {
    public static void main(String[] args) {

        int[] myArray = getIntArray(20);
        int[] copyOfMyArray;
        selectionSort(myArray);
        printArray(myArray);

        copyOfMyArray = Arrays.copyOf(myArray, myArray.length); // copies the values of myArray into copyOfMyArray...

    }

    private static void selectionSort(int[] myArray){
        int minIdx;
        int temp;
        for(int i = 0; i < myArray.length - 1 ; i++){
            minIdx = i;
            for(int j = i; j < myArray.length; j++){
                if(myArray[j] < myArray[minIdx]){
                    minIdx = j;
                }
            }
            temp = myArray[i];
            myArray[i] = myArray[minIdx];
            myArray[minIdx] = temp;
        }
        System.out.println("Array sorted successfully");
    }

    private static void printArray(int[] myArray){
        for(int i : myArray){
            System.out.println(i);
        }
    }

    private static int[] getIntArray(int length){
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

}
