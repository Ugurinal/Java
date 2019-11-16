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

        if (item == null) {
            System.out.println("Invalid value.");
            return false;
        }

        if (this.root == null) {
            System.out.println("The list is empty. You can not apply remove function.");
            return false;
        }

        ListItem temp = this.root;
        int compare = 1;
        while (temp != null) {
            compare = temp.compareTo(item);
            if (compare == 0) {
                //
                if (temp == this.root) {
                    // Item is found at the beginning of the list
                    this.root = this.root.next();
                } else {
                    // Item is found in the middle of the list
                    temp.previous().setNext(temp.next());
                    if (temp.next() != null) {
                        //Item is not at the and of the list if it is then this code will not be executed
                        temp.next().setPrevious(temp.previous());
                    }
                }
                return true;
            } else if (compare < 0) {
                temp = temp.next();
            } else {
                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        System.out.println(item.getValue() + " is not already in the list.");
        return false;

/*        MY CODE
        if (this.root == null) {
            System.out.println("The list is empty. You can not apply remove function.");
            return false;
        } else if (item == null) {
            System.out.println("Invalid value.");
            return false;
        } else {
            ListItem current = this.root;
            int compare = this.root.compareTo(item);
            if (compare == 0) {
                // Item is found at the beginning of the list
                this.root = this.root.next();
            } else {
                while (current.next() != null) {
                    compare = current.compareTo(item);
                    // Item is found at middle of the list
                    if (compare == 0) {
                        ListItem temp = current.next();
                        temp.setPrevious(current.previous());
                        current.previous().setNext(temp);
                        return true;
                    } else {
                        current = current.next();
                    }
                }
                // Item is found at the end of the list
                compare = current.compareTo(item);
                if (compare == 0) {
                    ListItem temp = current.previous();
                    temp.setNext(null);
                    current.setPrevious(null);
                    return true;
                }
                System.out.println(item.getValue() + " is already not on the list.");
                return false;
            }
        }
        return false;

 */
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

}
