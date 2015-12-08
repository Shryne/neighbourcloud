package se1app.praktikum.datatypes;

public class UserName {
    public static int MIN_NAME_SIZE = 5;

    private final String name;

    private UserName(String name) {
        this.name = name;
    }

    public static UserName of(String name) {
        conditionCheck(name);
        return new UserName(name);
    }

    private static void conditionCheck(String name) {
        if (name == null ||name.length() < MIN_NAME_SIZE)
            throw new IllegalArgumentException();
    }
}
