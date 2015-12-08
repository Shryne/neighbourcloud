package se1app.praktikum.datatypes;


import java.util.Objects;

public class Date {
    private final int day;
    private final int month;
    private final int year;

    private Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static Date of(int day, int month, int year) {
        conditionCheck(day, month, year);
        return new Date(day, month, year);
    }

    private static void conditionCheck(int day, int month, int year) {
        if (day < 0 || month < 0 || year < 0) throw new IllegalArgumentException();

        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                if (day > 31) throw new IllegalArgumentException();
                break;
            case 4:case 6:case 9:case 11:
                if (day > 30) throw new IllegalArgumentException();
                break;
            case 2:
                if (isLeapYear(year))
                    if (month > 29) throw new IllegalArgumentException();
                else
                    if (month > 28) throw new IllegalArgumentException();
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public boolean isLeapYear() {
        return isLeapYear(year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Date)) return false;

        Date other = (Date) o;
        return (day == other.day && month == other.month &&
            year == other.year);
    }

    @Override
    public int hashCode() {
        final int multi = 13;
        int hash = 7;

        hash *= multi + Integer.hashCode(day);
        hash *= multi + Integer.hashCode(month);
        hash *= multi + Integer.hashCode(year);
        return hash;
    }

    @Override
    public String toString() {
        return String.format("%s[%d, %d, %d]",
                getClass().getSimpleName(), day, month, year);
    }
}
