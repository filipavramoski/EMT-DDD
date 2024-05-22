package mk.ukim.finki.emt.reservationscatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import java.util.UUID;

public class ReservationId extends DomainObjectId {
    public ReservationId() {
        super("");
    }

    public ReservationId(String id) {
        super(id);
    }

    public static ReservationId randomId() {
        return new ReservationId(UUID.randomUUID().toString());
    }

    public static ReservationId of(String id) {
        return new ReservationId(id);
    }
}
