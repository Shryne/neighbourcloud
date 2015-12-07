package se1app.praktikum.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class EventPlaner {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Event> events = new ArrayList<>();

    @OneToMany
    //JoinColumn(name = "memory_id")
    private List<Memory> memories = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if(o instanceof EventPlaner){
            EventPlaner toCompare = (EventPlaner) o;
            return this.id.equals(toCompare.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "EventPlaner[id=%d, name='%s']", id, events);
    }
}
