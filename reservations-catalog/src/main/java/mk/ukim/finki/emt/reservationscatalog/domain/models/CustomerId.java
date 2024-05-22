package mk.ukim.finki.emt.reservationscatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import java.util.UUID;

public class CustomerId extends DomainObjectId {

    public CustomerId() {
        super("");
    }

    public CustomerId(String id) {
        super(id);
    }

    public static CustomerId randomId() {
        return new CustomerId(UUID.randomUUID().toString());
    }

    public static CustomerId of(String id) {
        return new CustomerId(id);
    }
}
