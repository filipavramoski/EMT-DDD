package mk.ukim.finki.emt.tablescatalog.domain.repository;

import mk.ukim.finki.emt.tablescatalog.domain.model.Restaurant;
import mk.ukim.finki.emt.tablescatalog.domain.model.RestaurantId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, RestaurantId> {
}
