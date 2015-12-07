package se1app.praktikum.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se1app.praktikum.UserRepository;

/**
 * Created by Tom on 07.12.2015.
 */
@SpringBootApplication
public class Starter {
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return (evt) -> userRepository.save(new User());
    }

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}
