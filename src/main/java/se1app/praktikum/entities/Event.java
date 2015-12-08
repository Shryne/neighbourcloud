package se1app.praktikum.entities;

import se1app.praktikum.datatypes.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Integer id;

    private Text name;
    private Address address;
    private Date date;
    private Time time;
    private Text description;
    private Picture picture;
    private Rating rating;
    private Category category;
    private List<Text> comments = new ArrayList<>();

    @ManyToOne
    private EventPlaner eventPlaner;

    public Event(Text name, Text description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public Text getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public Picture getPicture() {
        return picture;
    }

    public Rating getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }

    public List<Text> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Event)
            return id.equals(((Event) o).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "Event[id=%d, text='%s']", id, description.toString());
    }
}
