package mk.ukim.finki.emt.tablescatalog.services.impl;

import mk.ukim.finki.emt.tablescatalog.domain.model.Restaurant;
import mk.ukim.finki.emt.tablescatalog.domain.model.RestaurantId;
import mk.ukim.finki.emt.tablescatalog.domain.repository.RestaurantRepository;
import mk.ukim.finki.emt.tablescatalog.services.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getRestaurantById(RestaurantId id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void deleteRestaurant(RestaurantId id) {
        restaurantRepository.deleteById(id);
    }
}
