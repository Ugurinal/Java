/**
 * @author UGURINAL
 * on 10/17/2019
 * at 7:21 PM
 * AbstractClassesChallenge
 */

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            // The list was empty, so the item becomes the root of the list
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        int compare = 0;
        while (currentItem != null) {
            compare = currentItem.compareTo(item);
            if (compare < 0) {
                // New item is greate than currentItem, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, insert the new item at the end of the list
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (compare > 0) {
                // New item is less than currentItem, move left if possible
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                // equal
                System.out.println(item.getValue() + " is already on present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return true;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
