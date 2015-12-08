package se1app.praktikum.datatypes;

public class Picture {
    private final String filepath;

    private Picture(String filepath) {
        this.filepath = filepath;
    }

    public static Picture of(String filepath) {
        checkCondition(filepath);
        return new Picture(filepath);
    }

    private static void checkCondition(String filepath) {
        if (filepath == null) throw new IllegalArgumentException();
    }
}
