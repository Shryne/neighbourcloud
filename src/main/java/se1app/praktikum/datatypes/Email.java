package se1app.praktikum.datatypes;

public class Email {
    private String address;

    private Email(String address) {
        this.address = address;
    }

    public Email of(String address) {
        conditionCheck(address);
        return new Email(address);
    }

    private static void conditionCheck(String address) {
        if (address == null) throw new IllegalArgumentException();
    }

    public String address() {
        return address;
    }
}
