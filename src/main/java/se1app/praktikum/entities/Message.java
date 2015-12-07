package se1app.praktikum.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class Message {
    @Id
    @GeneratedValue
    private Integer id;

    private Date date;
    private Time time;
    private User recipient;
    private User sender;
    private Text text;
    private Picture picture;

    @Override
    public boolean equals(Object o) {
        if(o instanceof Message)
            return id.equals(((Message) o).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "Message[id=%d, text='%s']", id, text.toString());
    }
}
