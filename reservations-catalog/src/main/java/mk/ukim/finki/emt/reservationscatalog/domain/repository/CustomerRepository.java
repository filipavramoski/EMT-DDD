package mk.ukim.finki.emt.reservationscatalog.domain.repository;

import mk.ukim.finki.emt.reservationscatalog.domain.models.Customer;
import mk.ukim.finki.emt.reservationscatalog.domain.models.CustomerId;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Reservation;
import mk.ukim.finki.emt.reservationscatalog.domain.models.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {
}
