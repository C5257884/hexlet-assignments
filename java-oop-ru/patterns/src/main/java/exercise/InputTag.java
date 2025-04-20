package exercise;

import java.util.ArrayList;

// BEGIN
class InputTag implements TagInterface {

    private String tag;
    private String value;

    InputTag(String tag, String value) {
        this.tag = tag;
        this.value = value;
    }

    @Override
    public String render() {
        return  "<input type=\"" + tag + "\" value=\"" + value + "\">" ;
    }
}
// END
