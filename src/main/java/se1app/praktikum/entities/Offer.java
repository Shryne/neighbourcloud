package se1app.praktikum.entities;

import se1app.praktikum.datatypes.OfferType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

/**
 * Created by Tom on 07.12.2015.
 */
@Entity
public class Offer {
    @Id
    @GeneratedValue
    private Integer id;

    private Price price;
    private Date date;
    private Duration duration;
    private Text description;
    private Text title;
    private List<Text> comments = new ArrayList<>();
    private OfferType offerType;

    @ManyToOne
    private Market market;

    public Offer(Text title, OfferType offerType) {
        this.offerType = offerType;
        this.title = title;
    }

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
                "Offer[id=%d, text='%s']", id, text.toString());
    }
}
