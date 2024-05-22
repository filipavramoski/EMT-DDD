package mk.ukim.finki.emt.tablescatalog.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.tablescatalog.domain.valueobjects.Address;

import java.sql.Time;

@Entity
@Table(name="restaurant")
@Getter

public class Restaurant extends AbstractEntity<RestaurantId> {
    private String restaurantName;
    private Time openingHours;
    private Time closingHours;
    private Address address;

    protected Restaurant() {
        super(RestaurantId.randomId());
    }

    public Restaurant(String restaurantName, Time openingHours, Time closingHours, Address address) {
        super(RestaurantId.randomId());
        this.restaurantName = restaurantName;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
        this.address = address;
    }
    public String getAddressFormat() {
        return address.getAddressFormat();
    }

}
