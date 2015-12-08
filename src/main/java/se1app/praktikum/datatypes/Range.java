package se1app.praktikum.datatypes;

public class Range {
    private final int start;
    private final int end;

    private Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static Range of(int start, int end) {
        conditionCheck(start, end);
        return new Range(start, end);
    }

    private static void conditionCheck(int start, int end) {
        if (start > end) throw new IllegalArgumentException();
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
