package se1app.praktikum.datatypes;

public class Password {
    private String password;

    private Password(String password) {
        this.password = password;
    }

    public static Password of(String password) {
        if (password == null) throw new IllegalArgumentException();
        return new Password(password);
    }

    public String getPassword() {
        return password;
    }
}
