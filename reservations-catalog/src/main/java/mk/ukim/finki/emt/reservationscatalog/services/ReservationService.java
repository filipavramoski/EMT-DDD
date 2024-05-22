package mk.ukim.finki.emt.reservationscatalog.services;

import mk.ukim.finki.emt.reservationscatalog.domain.exceptions.ReservationIdNotExistException;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Customer;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Reservation;
import mk.ukim.finki.emt.reservationscatalog.domain.models.ReservationId;
import mk.ukim.finki.emt.reservationscatalog.services.forms.ReservationForm;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    ReservationId placeReservation(ReservationForm reservationForm);

    List<Reservation> findAll();

    Optional<Reservation> findById(ReservationId id);

    void cancelReservation(ReservationId reservationId) throws ReservationIdNotExistException;
    void notifyCustomer(Customer customer, Reservation reservation);

}
