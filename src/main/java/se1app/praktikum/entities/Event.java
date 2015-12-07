package se1app.praktikum.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class Event {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
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

    @Override
    public boolean equals(Object o) {
        if(o instanceof Event)
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
