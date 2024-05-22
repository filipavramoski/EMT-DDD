package mk.ukim.finki.emt.tablescatalog.services;

import mk.ukim.finki.emt.tablescatalog.domain.model.Restaurant;
import mk.ukim.finki.emt.tablescatalog.domain.model.RestaurantId;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    List<Restaurant> getAllRestaurants();
    Optional<Restaurant> getRestaurantById(RestaurantId id);
    Restaurant saveRestaurant(Restaurant restaurant);
    void deleteRestaurant(RestaurantId id);
}