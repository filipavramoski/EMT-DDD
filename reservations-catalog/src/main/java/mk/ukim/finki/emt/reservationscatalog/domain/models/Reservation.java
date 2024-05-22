package mk.ukim.finki.emt.reservationscatalog.domain.models;

import jakarta.persistence.*;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.Quantity;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.RestaurantId;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.TableId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "reservation")
public class Reservation extends AbstractEntity<ReservationId> {

    private Quantity numberOfPeople;
    private Time timeOfRes;
    private Date dateofRes;

    @Enumerated(EnumType.STRING)
    private ReservationState reservationState;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @AttributeOverride(name = "id", column = @Column(name = "restaurant_id", nullable = false))
    private RestaurantId restaurantId;

    @AttributeOverride(name = "id", column = @Column(name = "table_id", nullable = false))
    private TableId tableId;

    public static Reservation build(Quantity numberOfPeople, Time timeOfRes, Date dateofRes, RestaurantId restaurantId, TableId tableId) {
        Reservation r = new Reservation();
        r.numberOfPeople = numberOfPeople;
        r.timeOfRes = timeOfRes;
        r.dateofRes = dateofRes;
        r.restaurantId = restaurantId;
        r.tableId = tableId;
        return r;
    }

    protected Reservation() {
        super(ReservationId.randomId());
    }
}
