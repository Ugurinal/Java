import java.util.ArrayList;

/**
 * Created by UGURINAL
 * on 8/24/2019
 * at 9:41 PM
 * AutoboxingAndUnboxing
 */

// Our own integer class
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("UGURINAL");
        System.out.println(stringArrayList.get(0));


//      ArrayList<int> intArrayList = new ArrayList<int>(); Since integer is not a class it does not work. If we do not create our int class.
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();  // We created our int class.
        intClassArrayList.add(new IntClass(20));
        System.out.println(intClassArrayList.get(0).getMyValue());


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(123);
        System.out.println(integerArrayList.get(0));

        Integer myInt = 50; // java converts this code into the below one
//        Integer myIInt = Integer.valueOf(50);

        for (int i = 0; i < 10; i++){
//            integerArrayList.add(10);  java converts this code into the code below which called auto boxing
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < integerArrayList.size(); i++){
//            integerArrayList.get(i);  java converts this code into the code below which called unboxing
            System.out.println(integerArrayList.get(i).intValue());
        }
    }
}
