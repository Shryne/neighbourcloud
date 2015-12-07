package se1app.praktikum.operations;

import se1app.praktikum.entities.User;

/**
 * Created by Tom on 07.12.2015.
 */
public interface UserOperations {
    boolean login(UserName name, Password password);
    boolean logout(User user);
    User register(UserName name, Password password, Range range);

    boolean setRange(User user, Range range);

    Event createNewEvent(User user, String name, Date date, Time time);
    boolean commentEvent(User user, Event event, Text comment);
}
