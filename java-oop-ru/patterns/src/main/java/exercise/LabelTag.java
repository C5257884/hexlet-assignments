package exercise;

import javax.swing.text.html.HTML;
import java.util.ArrayList;

// BEGIN
class LabelTag implements TagInterface {
    private String caption;
    private TagInterface tag;

    @Override
    public String render() {
        return "<label>" + caption + tag.render() + "</label>";
    }
    LabelTag(String caption, TagInterface tag) {
        this.caption = caption;
        this.tag = tag;
    }
}
// END
