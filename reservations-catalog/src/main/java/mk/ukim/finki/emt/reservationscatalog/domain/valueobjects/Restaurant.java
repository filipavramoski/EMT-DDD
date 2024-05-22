package mk.ukim.finki.emt.reservationscatalog.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Restaurant {

    private RestaurantId id;
    private String name;
    private String location;

    protected Restaurant() {
        // For JPA
    }

    public Restaurant(RestaurantId id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
}