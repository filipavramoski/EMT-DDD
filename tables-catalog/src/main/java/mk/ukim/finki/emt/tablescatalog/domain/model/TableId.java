package mk.ukim.finki.emt.tablescatalog.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import java.util.UUID;

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
