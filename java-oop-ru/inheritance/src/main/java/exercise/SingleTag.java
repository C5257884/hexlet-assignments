package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    String tagName;
    Map<String, String> tagAttrs;

    public SingleTag(String tagName, Map<String, String> tagAttrs) {
        this.tagName = tagName;
        this.tagAttrs = tagAttrs;
    }

    @Override
    public String toString() {
        return "<" + tagName + map2Str(tagAttrs) + ">";
    }

}
// END
