package mk.ukim.finki.emt.reservationscatalog.domain.valueobjects;

import jakarta.persistence.Embeddable;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import java.util.UUID;

@Embeddable
public class TableId extends DomainObjectId {
    protected TableId() {
        super("");
    }

    public TableId(String id) {
        super(id);
    }

    public static TableId randomId() {
        return new TableId(UUID.randomUUID().toString());
    }

    public static TableId of(String id) {
        return new TableId(id);
    }
}
