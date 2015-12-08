package se1app.praktikum.datatypes;

public class PhoneNumber {
    private int prefix;
    private int postfix;

    private PhoneNumber(int prefix, int postfix) {
        this.prefix = prefix;
        this.postfix = postfix;
    }

    public static PhoneNumber of(int prefix, int postfix) {
        conditionCheck(prefix, postfix);
        return new PhoneNumber(prefix, postfix);
    }

    private static void conditionCheck(int prefix, int postfix) {
        if (prefix < 0 || postfix < 0) throw new IllegalArgumentException();
    }

    public int getPrefix() {
        return prefix;
    }

    public int getPostfix() {
        return postfix;
    }

    public int getNumber() {
        return Integer.parseInt(prefix + "" + postfix);
    }
}
