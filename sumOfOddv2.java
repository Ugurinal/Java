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
        boolean check;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting value: ");

        //check = input.hasNextInt();     /// Checking the value whether it is int or not
        if(input.hasNextInt()){           /// if(check)  
            start = input.nextInt();
            System.out.println("Enter the last value: ");
           // check = input.hasNextInt();
            if (input.hasNextInt()){      /// if(check)
                end = input.nextInt();
                System.out.println("The sum of odd numbers from "+start +" to "+end +" is " +sumOdd(start,end));

            } else{
                System.out.println("You enterd invalid value...");
            }

        }else{
            System.out.println("You entered invalid value...");
        }


        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //                                                                                                      //
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


        input.close();

    }
}

