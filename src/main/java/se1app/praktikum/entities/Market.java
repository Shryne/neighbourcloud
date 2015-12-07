package se1app.praktikum.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class Market {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private List<User> acteurs = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Offer> offers = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if(o instanceof Market)
            return id.equals(((Market) o).id);
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "Market[id=%d, text='%s']", id, offers.toString());
    }
}
