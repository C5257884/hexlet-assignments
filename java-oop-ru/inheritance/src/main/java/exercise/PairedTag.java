package exercise;

import java.util.List;
import java.util.Map;

public class PairedTag extends Tag {
    String tagName;
    Map<String, String> tagAttrs;
    String tagText;
    List<Tag> tagsArray;

    public PairedTag(String tagName, Map<String, String> tagAttrs, String tagText, List<Tag> tagsArray) {
        this.tagName = tagName;
        this.tagAttrs = tagAttrs;
        this.tagText = tagText;
        this.tagsArray = tagsArray;
    }

    @Override
    public String toString() {
        return "<" + tagName + map2Str(tagAttrs) + ">" + tagText + tagsArray2Str(tagsArray) + "</" + tagName + ">";
    }
}
// END
