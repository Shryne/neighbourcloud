package tests;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se1app.praktikum.entities.Offer;
import se1app.praktikum.entities.User;
import se1app.praktikum.implementations.AppUseCases;
import se1app.praktikum.main.Starter;
import se1app.praktikum.repository.OfferRepository;
import se1app.praktikum.repository.UserRepository;

import javax.transaction.Transactional;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Tom on 07.12.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Starter.class)
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
        Offer offer = appUseCases.sell(User.of("Steve"), Price.of(50), Text.of("abc"));
        assertTrue(offerRepository.exists(offer.getId()));
    }

    @Test
    public void testBuy() {
        Offer offer = appUseCases.buy(User.of("Steve"), Price.of(50), Text.of("abc"));
        assertTrue(offerRepository.exists(offer.getId()));

    }
}
