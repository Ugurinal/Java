import java.util.ArrayList;

/**
 * Created by UGURINAL
 * on 8/22/2019
 * at 11:18 PM
 * ListAndArrayList
 */

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size() +" items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println("#" +(i + 1) +" " +groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int index, String item){
        groceryList.set(index - 1, item);
        System.out.println("Grocery item #" +index +" has been modified." );
    }

    public void removeItem(int index){
        String item = groceryList.get(index - 1);
        groceryList.remove(index - 1);
        System.out.println(index +" has been removed in your grocery list.");
    }

    public String findItem(String searchItem){
        boolean exist = groceryList.contains(searchItem);   //Checks the array whether it contains the item or not.
        int index = groceryList.indexOf(searchItem);    // Returns the index of object if it exists otherwise returns -1

        if(index >= 0){
            return groceryList.get(index);
        }

        return null;
    }
}
