package se1app.praktikum.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class Memory {
    @Id
    @GeneratedValue
    private Integer id;

    private Date date;
    private Time time;
    private Text text;

    @ManyToOne
    private EventPlaner eventPlaner;

    @Override
    public boolean equals(Object o) {
        if(o instanceof Memory)
            return id.equals(((Memory) o).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "Memory[id=%d, text='%s']", id, text.toString());
    }
}
