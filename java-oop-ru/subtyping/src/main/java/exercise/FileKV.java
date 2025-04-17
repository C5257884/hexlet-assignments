package exercise;

//import java.io.File;
//import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV extends InMemoryKV {
    private String filePath;
//    private Map<String, String> map;

    FileKV(String filePath, Map<String, String> inMap) {
        super(inMap);
        this.filePath = filePath;
        var storedMap = Utils.deserialize(Utils.readFile(filePath));
        for (var entry : storedMap.entrySet()) {
            super.set(entry.getKey(), entry.getValue());
        }
        Utils.writeFile(filePath, Utils.serialize(this.map));
    }

    @Override
    public void set(String key, String value) {
        super.set(key, value);
        Utils.writeFile(filePath, Utils.serialize(this.map));
    }

    @Override
    public void unset(String key) {
        super.unset(key);
        Utils.writeFile(filePath, Utils.serialize(this.map));
    }

    @Override
    public String get(String key, String defaultValue) {
        return super.get(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return super.toMap();
    }
}
// END
