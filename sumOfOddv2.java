import java.util.Scanner;

public class Main {

    private static boolean isOdd(int number){

        if(number<0){
            return false;
        }

        return ( number % 2 == 1);
        }



    private static int sumOdd(int start, int end){

        if(end >= start && ( end > 0 && start > 0)){

            int sums = 0;
            for(int i = start; i <= end ; i++){
                if(isOdd(i)){
                    sums += i;
                }
            }

            return sums;

        }else{
            return -1;
        }

    }


    public static void main(String[] args){

        int start;
        int end;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting value: ");

        input.hasNextInt();     /// Checking the value whether it is int or not
        start = input.nextInt();

        System.out.println("Enter the last value: ");

        input.hasNextInt();     /// Checking the value whether it is int or not
        end = input.nextInt();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        // if we are going to enter String we have to deal Line ( \n enter ) issue. To solve this we must add   //
        // extra input.NextLine(); line before we take the string from user...                                  //
        // E.g.                                                                                                 //
        //                                                                                                      //
        //  String x;                                                                                           //
        //  input.hasNextInt();                                                                                 //
        //  start = input.nextInt();                                                                            //
        //  input.NextLine(); -----> This is the extra line to handle the next line character ( \n enter key)   //
        //  x = input.NextLine();                                                                               //
        //  System.out.println(x);                                                                              //
        //                                                                                                      //
        //////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("The sum of odd numbers from "+start +" to "+end +" is " +sumOdd(start,end));

        input.close();

    }
}

