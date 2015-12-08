package se1app.praktikum.datatypes;

public class Rating {
    private final int min;
    private final int max;
    private final int value;

    private Rating(int min, int max, int value) {
        this.min = min;
        this.max = max;
        this.value = value;
    }

    public static Rating of(int min, int max, int value) {
        conditionCheck(min, max, value);
        return new Rating(min, max, value);
    }

    public static Rating of(int value) {
        conditionCheck(0, 5, value);
        return new Rating(0, 5, value);
    }

    private static void conditionCheck(int min, int max, int value) {
        if (min > max || (min > value && value > max))
            new IllegalArgumentException();
    }
}
