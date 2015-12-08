package se1app.praktikum.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se1app.praktikum.datatypes.Password;
import se1app.praktikum.datatypes.Range;
import se1app.praktikum.datatypes.UserName;
import se1app.praktikum.entities.User;
import se1app.praktikum.repository.UserRepository;

@SpringBootApplication
public class Application {

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        User user = new User(UserName.of("Steve"), Password.of("abc"), Range.of(0, 5));
        return (evt) -> userRepository.save(user);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
