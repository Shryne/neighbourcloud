package se1app.praktikum.operations;

import se1app.praktikum.entities.User;

/**
 * Created by Tom on 07.12.2015.
 */
public interface SellOperations {
    Offer sell(User user, Price price, Title title);
    Offer buy(User user, Price price, Title title);
}
