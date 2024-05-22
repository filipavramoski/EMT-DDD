package mk.ukim.finki.emt.tablescatalog.xports.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.tablescatalog.domain.model.Restaurant;
import mk.ukim.finki.emt.tablescatalog.domain.model.RestaurantId;
import mk.ukim.finki.emt.tablescatalog.services.RestaurantService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/restaurant")
@AllArgsConstructor
public class RestaurantResource {

    private final RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> getAll() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Optional<Restaurant> findById(@PathVariable String id) {
        return restaurantService.getRestaurantById(RestaurantId.of(id));
    }
}