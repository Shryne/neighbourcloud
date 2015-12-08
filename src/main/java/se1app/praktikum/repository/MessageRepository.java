package se1app.praktikum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.praktikum.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
