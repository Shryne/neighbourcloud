package se1app.praktikum.datatypes;

public class Address {
    private final String name;
    private final int number;

    private Address(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Address of(String name, int number) {
        conditionCheck(name, number);
        return new Address(name, number);
    }

    private static void conditionCheck(String name, int number) {
        if (name == null || name.equals(" ") || number <= 0)
            throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
