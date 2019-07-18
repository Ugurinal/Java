public class Main {

    public static boolean isOdd(int number){

        if(number<0){
            return false;
        }

        return ( number % 2 == 1);
        }



    public static int sumOdd(int start, int end){

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

        System.out.println(sumOdd(100,1000));

    }
}

