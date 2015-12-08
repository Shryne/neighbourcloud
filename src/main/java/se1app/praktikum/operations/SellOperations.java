package se1app.praktikum.operations;

import se1app.praktikum.datatypes.Price;
import se1app.praktikum.datatypes.Text;
import se1app.praktikum.entities.Offer;
import se1app.praktikum.entities.User;

/**
 * Created by Tom on 07.12.2015.
 */
public interface SellOperations {
    Offer sell(User user, Price price, Text title);
    Offer buy(User user, Price price, Text title);
}
