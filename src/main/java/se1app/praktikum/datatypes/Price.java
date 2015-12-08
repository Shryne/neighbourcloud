package se1app.praktikum.datatypes;

public class Price {
    public final int value;

    private Price(int value) {
        this.value = value;
    }

    public static Price of(int value) {
        conditionCheck(value);
        return new Price(value);
    }

    private static void conditionCheck(int value) {
        if (value < 0) throw new IllegalArgumentException();
    }

    public int getValue() {
        return value;
    }
}
