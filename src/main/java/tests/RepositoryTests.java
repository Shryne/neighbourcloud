package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import se1app.praktikum.datatypes.Password;
import se1app.praktikum.datatypes.Range;
import se1app.praktikum.datatypes.UserName;
import se1app.praktikum.entities.User;
import se1app.praktikum.main.Application;
import se1app.praktikum.repository.UserRepository;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class RepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndLoad() {
        User user = new User(UserName.of("Steve"), Password.of("abc"), Range.of(0, 10));
        userRepository.save(user);
        List<User> users = userRepository.findAll();

        assertTrue(users.get(0).equals(user));
    }
}
