/**
 * Created by UGURINAL
 * on 8/21/2019
 * at 4:31 PM
 * #2
 */

public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[20];
        fillArray(myArray);
        selectionSort(myArray);
        printArray(myArray);

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

    private static void fillArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random() * 1000);
        }
    }

}
