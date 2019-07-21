import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int minnumber = 0, maxnumber = 0, temp;
        
//        minnumber = Integer.MIN_VALUE;          we could use these instead of checking the first...
//        maxnumber = Integer.MAX_VALUE;
        
        Scanner input = new Scanner(System.in);
        boolean checking;
        boolean first = true;

        System.out.println("Enter the numbers");
        checking = input.hasNextInt();

        while(checking){
            temp = input.nextInt();

            if(first){
                maxnumber = temp;
                minnumber = temp;
                first = false;

            }else if(temp > maxnumber){
                maxnumber = temp;

            }else if(temp < minnumber){
                minnumber = temp;
            }

            input.hasNextLine();    //handle input

            checking = input.hasNextInt();

        }

        System.out.println("Min number is "+minnumber + " and max number is "+maxnumber);

        input.close();

    }
}

