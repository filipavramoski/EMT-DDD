package mk.ukim.finki.emt.sharedkernel.domain.events.reservations;



import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.sharedkernel.domain.events.DomainEvent;

@Getter
public class ReservationCreated extends DomainEvent {

    private String reservationId;
    private String restaurantId;
    private int numberOfPeople;

    public ReservationCreated(String reservationId, String restaurantId, int numberOfPeople) {
        super(TopicHolder.TOPIC_RESERVATION_CREATED);
        this.reservationId = reservationId;
        this.restaurantId = restaurantId;
        this.numberOfPeople = numberOfPeople;
    }

    public ReservationCreated( String reservationId) {
        super(TopicHolder.TOPIC_RESERVATION_CREATED);
        this.reservationId = reservationId;
    }
}
