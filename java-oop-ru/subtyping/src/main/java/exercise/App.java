package exercise;

//import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

// BEGIN
public class App {
    static void swapKeyValue(KeyValueStorage objDB) {
//        Map<String, String> swappedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : objDB.toMap().entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();

            if (key != value) {
                objDB.unset(key);
                objDB.set(value, key);
            }
        }
    }
}
// END
