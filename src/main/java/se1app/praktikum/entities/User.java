package se1app.praktikum.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private UserName name;
    private Password password;
    private UserName nickName;
    private Email mail;
    private PhoneNumber phoneNumber;
    private Address address;
    private Range range;
    private Rating rating;

    @ManyToMany
    private List<Message> messages = new ArrayList<>();

    @ManyToOne
    private Market market;

    @OneToOne
    private EventPlaner eventPlaner;



    @Override
    public boolean equals(Object o) {
        if(o instanceof User)
            return id.equals(((User) o).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, text='%s']", id, name.toString());
    }
}
