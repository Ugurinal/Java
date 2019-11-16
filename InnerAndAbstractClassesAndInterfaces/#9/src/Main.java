import java.util.LinkedList;

/**
 * @author UGURINAL
 * on 10/17/2019
 * at 12:22 AM
 * AbstractClassesChallenge
 */

public class Main {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList(null);

        test.addItem(new Node("0"));
        test.addItem(new Node("1"));
        test.addItem(new Node("2"));
        test.addItem(new Node("3"));
        test.removeItem(new Node("9"));
        test.addItem(new Node("4"));
        test.addItem(new Node("5"));
        test.addItem(new Node("6"));
        test.addItem(new Node("7"));
        test.addItem(new Node("8"));
        test.removeItem(new Node("0"));
        test.removeItem(new Node("1"));
        test.removeItem(new Node("2"));
        test.removeItem(new Node("3"));
        test.removeItem(new Node("4"));
        test.removeItem(new Node("5"));
        test.removeItem(new Node("6"));
        test.removeItem(new Node("7"));
        test.removeItem(new Node("8"));

        test.traverse(test.getRoot());


        test.addItem(new Node("113"));
        test.addItem(new Node("150"));
        test.addItem(new Node("100"));
        test.addItem(new Node("-1"));
        test.addItem(new Node("10"));
        test.addItem(new Node("0"));
        test.addItem(new Node("999"));
        test.addItem(new Node("8"));


        test.traverse(test.getRoot());


    }
}
