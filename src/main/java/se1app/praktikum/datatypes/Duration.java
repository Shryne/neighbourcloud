package se1app.praktikum.datatypes;

public class Duration {
    private Date start;
    private Date end;

    private Duration(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Duration of(Date start, Date end) {
        return new Duration(start, end);
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
