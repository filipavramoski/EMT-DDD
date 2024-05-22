package mk.ukim.finki.emt.reservationscatalog.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.reservationscatalog.domain.exceptions.ReservationIdNotExistException;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Customer;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Reservation;
import mk.ukim.finki.emt.reservationscatalog.domain.models.ReservationId;
import mk.ukim.finki.emt.reservationscatalog.domain.repository.ReservationRepository;
import mk.ukim.finki.emt.reservationscatalog.services.ReservationService;
import mk.ukim.finki.emt.reservationscatalog.services.forms.ReservationForm;
import mk.ukim.finki.emt.sharedkernel.domain.events.reservations.ReservationCanceled;
import mk.ukim.finki.emt.sharedkernel.domain.events.reservations.ReservationCreated;
import mk.ukim.finki.emt.sharedkernel.infra.DomainEventPublisher;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final DomainEventPublisher domainEventPublisher;

    @Override
    public ReservationId placeReservation(ReservationForm reservationForm)  {
        Objects.requireNonNull(reservationForm, "Reservation form must not be null.");

        var newReservation = reservationRepository.saveAndFlush(toDomainObject(reservationForm));
        // Publish domain events if needed
        domainEventPublisher.publish(new ReservationCreated(newReservation.getId().toString()));
        return newReservation.getId();
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findById(ReservationId id) {
        return reservationRepository.findById(id);
    }

    private Reservation toDomainObject(ReservationForm reservationForm) {
        return Reservation.build(
                reservationForm.getNumberOfPeople(),
                reservationForm.getTimeOfRes(),
                reservationForm.getDateOfRes(),
                reservationForm.getRestaurantId(),
                reservationForm.getTableId()
        );
    }

    @Override
    public void cancelReservation(ReservationId reservationId) throws ReservationIdNotExistException {
        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(ReservationIdNotExistException::new);
        reservationRepository.delete(reservation);

        domainEventPublisher.publish(new ReservationCanceled(reservationId.toString()));
    }

    @Override
    public void notifyCustomer(Customer customer, Reservation reservation) {
        System.out.println("Notification sent to customer: " + customer.getEmail() + " for reservation: " + reservation.getId());
    }
}
