package se1app.praktikum.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import se1app.praktikum.datatypes.*;
import se1app.praktikum.entities.Event;
import se1app.praktikum.entities.Offer;
import se1app.praktikum.entities.User;
import se1app.praktikum.main.Application;
import se1app.praktikum.operations.SellOperations;
import se1app.praktikum.operations.UserOperations;
import se1app.praktikum.repository.OfferRepository;

@Transactional
@ContextConfiguration(classes = Application.class)
public class AppUseCases implements SellOperations, UserOperations {
    private static final int TITLE_LENGTH = 20;

    @Autowired
    private OfferRepository offerRepository;

    /**
     * Creates an Offer and inserts it into the database.
     *
     * @param user Has to be a valid User. (!= null)
     * @param price Has to be a valid price. (!= null)
     * @param title Has to be a valid title. (!= null)
     * @return The created Offer.
     *
     * @throws IllegalArgumentException in case of user == null,
     * price == null or title == null
     */
     @Override
    public Offer sell(User user, Price price, Text title) {
        if (user == null || price == null || title == null)
            throw new IllegalArgumentException();

        Offer offer = new Offer(title, OfferType.SELL);
        offer.setPrice(price);
        offerRepository.save(offer);

        return offer;
    }

    @Override
    public Offer buy(User user, Price price, Text title) {
        if (user == null || price == null || title == null)
            throw new IllegalArgumentException();

        Offer offer = new Offer(title, OfferType.BUY);
        offer.setPrice(price);
        offerRepository.save(offer);

        return offer;
    }

    @Override
    public boolean login(UserName name, Password password) {
        return false;
    }

    @Override
    public boolean logout(User user) {
        return false;
    }

    @Override
    public User register(UserName name, Password password, Range range) {
        return null;
    }

    @Override
    public boolean setRange(User user, Range range) {
        return false;
    }

    @Override
    public Event createNewEvent(User user, String name, Date date, Time time) {
        return null;
    }

    @Override
    public boolean commentEvent(User user, Event event, Text comment) {
        return false;
    }
}
