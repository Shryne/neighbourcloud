package se1app.praktikum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.praktikum.entities.Message;
import se1app.praktikum.entities.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {
}
