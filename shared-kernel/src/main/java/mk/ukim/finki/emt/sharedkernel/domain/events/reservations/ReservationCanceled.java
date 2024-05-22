package mk.ukim.finki.emt.sharedkernel.domain.events.reservations;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

@Getter
public class ReservationCanceled extends DomainEvent {

    private String reservationId;

    public ReservationCanceled(String reservationId) {
        super(TopicHolder.TOPIC_RESERVATION_CANCELED);
        this.reservationId = reservationId;
    }
}