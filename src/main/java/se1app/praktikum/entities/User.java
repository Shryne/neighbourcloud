package se1app.praktikum.entities;

import se1app.praktikum.datatypes.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    public User(UserName name, Password password, Range range) {
        this.name = name;
        this.password = password;
        this.range = range;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public EventPlaner getEventPlaner() {
        return eventPlaner;
    }

    public Integer getId() {
        return id;
    }

    public Password getPassword() {
        return password;
    }

    public UserName getName() {
        return name;
    }

    public UserName getNickName() {
        return nickName;
    }

    public Email getMail() {
        return mail;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public Range getRange() {
        return range;
    }

    public Rating getRating() {
        return rating;
    }

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
