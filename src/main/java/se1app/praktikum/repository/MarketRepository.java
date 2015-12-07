package se1app.praktikum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1app.praktikum.entities.Market;
import se1app.praktikum.entities.Message;

/**
 * Created by Tom on 07.12.2015.
 */
@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {

}
