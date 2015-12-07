package tests;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import se1app.praktikum.*;
import se1app.praktikum.datatypes.OfferType;
import se1app.praktikum.entities.Offer;
import se1app.praktikum.entities.User;
import se1app.praktikum.implementations.AppUseCases;
import se1app.praktikum.main.Starter;
import se1app.praktikum.repository.UserRepository;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Starter.class)
public class RepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndLoad(){
        User user = new User(UserName.of("Steve"), Password.of("abc"), Range.of(10));
        userRepository.save(user);
        List<User> users = userRepository.findAll();

        assertTrue(users.get(0).equals(user));
    }
}
