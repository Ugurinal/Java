public class Main {

    public static boolean isLeapYear(int year){
        if(year>=1 && year <=9999){

            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year %400 ==0){
                        System.out.println("The year is a leap year (it has 366 days).");
                        return true;
                    }
                    System.out.println("The year is not a leap year (it has 365 days).");
                    return false;
                }

                System.out.println("The year is a leap year (it has 366 days).");
                return true;
            }

            return false;
        }

        return false;
    }



    public static void main(String [] args){

        System.out.println(isLeapYear(1924));

    }
}   
