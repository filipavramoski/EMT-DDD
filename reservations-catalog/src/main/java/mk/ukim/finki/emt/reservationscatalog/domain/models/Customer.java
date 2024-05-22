package mk.ukim.finki.emt.reservationscatalog.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
public class Customer extends AbstractEntity<CustomerId> {
    private String name;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations = new ArrayList<>();

    public static Customer build(String name, String phone, String email) {
        Customer c = new Customer();

        c.name = name;
        c.phone = phone;
        c.email = email;

        return c;
    }

    public Customer() {
        super(CustomerId.randomId());
    }
}
