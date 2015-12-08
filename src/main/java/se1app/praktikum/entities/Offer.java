package se1app.praktikum.entities;

import se1app.praktikum.datatypes.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

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
        if(o instanceof Offer)
            return id.equals(((Offer) o).id);
        return false;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public Text getDescription() {
        return description;
    }

    public void setOfferType(OfferType offerType) {
        this.offerType = offerType;
    }

    public OfferType getOfferType() {
        return offerType;
    }

    public void setComments(List<Text> comments) {
        this.comments = comments;
    }

    public List<Text> getComments() {
        return comments;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format(
                "Offer[id=%d, text='%s']", id, title.toString());
    }

    public Integer getId() {
        return id;
    }
}
