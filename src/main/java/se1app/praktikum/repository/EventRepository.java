package se1app.praktikum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.praktikum.entities.Event;
import se1app.praktikum.entities.Message;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
