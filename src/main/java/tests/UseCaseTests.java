package tests;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se1app.praktikum.datatypes.*;
import se1app.praktikum.entities.Offer;
import se1app.praktikum.entities.User;
import se1app.praktikum.implementations.AppUseCases;
import se1app.praktikum.main.Application;
import se1app.praktikum.repository.OfferRepository;
import se1app.praktikum.repository.UserRepository;

import javax.transaction.Transactional;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class UseCaseTests {
    private AppUseCases appUseCases;

    @Autowired
    private OfferRepository offerRepository;

    @Before
    public void setup() {
        appUseCases = new AppUseCases();
    }

    @Test
    public void testSell() {
        User user = new User(UserName.of("Steve"), Password.of("abc"), Range.of(0, 5));
        Offer offer = appUseCases.sell(user, Price.of(50), Text.of("abc"));
        assertTrue(offerRepository.exists(offer.getId()));
    }

    @Test
    public void testBuy() {
        User user = new User(UserName.of("Steve"), Password.of("abc"), Range.of(0, 5));
        Offer offer = appUseCases.buy(user, Price.of(50), Text.of("abc"));
        assertTrue(offerRepository.exists(offer.getId()));
    }
}
