package se1app.praktikum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.praktikum.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
