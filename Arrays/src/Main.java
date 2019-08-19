import java.util.Scanner;

/**
 * Created by UGURINAL
 * on 19.08.2019
 * at 03:06
 * Arrays
 */


public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // new int[10];
//        double[] doubleArray = new double[10];
//        System.out.println(intArray[0]);
//        System.out.println(doubleArray[5]);
//
//        intArray[5] = 10;
//        doubleArray[2] = 10;
//        System.out.println(intArray[5]);
//        System.out.println(doubleArray[2]);5

        int[] myIntArray = produceIntArray(5);
        printIntArray(myIntArray);
        System.out.println("The average of array = "+getAverage(myIntArray));
    }

    public static int[] produceIntArray(int size){
        int[] myArray = new int[size];
        System.out.println("Enter "+size+" integer values.");

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
        }
        return myArray;
    }

    public static void printIntArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println("#"+(i + 1)+" = "+myArray[i]);
        }
    }

    public static double getAverage(int[] myArray){
        double sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        return sum / myArray.length;
    }
}

