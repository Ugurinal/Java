/**
 * @author UGURINAL
 * on 10/17/2019
 * at 7:19 PM
 * AbstractClassesChallenge
 */

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
