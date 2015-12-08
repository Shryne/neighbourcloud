package se1app.praktikum.datatypes;

public class Text {
    private final String txt;

    private Text(String txt) {
        this.txt = txt;
    }

    public static Text of(String txt) {
        conditionCheck(txt);
        return new Text(txt);
    }

    private static void conditionCheck(String txt) {

    }

    public String getString() {
        return txt;
    }
}
