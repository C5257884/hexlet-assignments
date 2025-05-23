package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    Map<String, String> map;

    InMemoryKV(Map<String, String> map) {
        this.map = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        var retVal = map.get(key);
        if (retVal == null) {
            retVal = defaultValue;
        }
        return retVal;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}
// END
