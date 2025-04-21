package exercise;

//import java.util.ArrayList;

import java.util.List;
import java.util.Map;

// BEGIN
abstract class Tag {
    protected String map2Str(Map<String, String> tagAttrs) {
        String s;
        String delemiter;

        s = "";
        delemiter = "";

        for (Map.Entry<String, String> entry : tagAttrs.entrySet()) {
            s = s + delemiter + entry.getKey() + "=\"" + entry.getValue() + "\"";
            delemiter = " ";
        }
        if (s.length() > 0) {
            return delemiter + s;
        }
        return s;
    }

    protected String tagsArray2Str(List<Tag> tagsList) {
        String s;

        s = "";
        for (Tag tag : tagsList) {
            s = s + tag.toString();
        }
        return s;
    }
}
// END
