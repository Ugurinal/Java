import java.util.List;

/**
 * @author UGURINAL
 * on 8/29/2019
 * at 4:11 PM
 * InterfaceChallenge
 */

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValue);

}
