package mk.ukim.finki.emt.tablescatalog.domain.model;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

import java.util.UUID;

public class RestaurantId extends DomainObjectId {

    protected RestaurantId() {
        super("");
    }

    public RestaurantId(String id) {
        super(id);
    }

    public static RestaurantId randomId() {
        return new RestaurantId(UUID.randomUUID().toString());
    }

    public static RestaurantId of(String id) {
        return new RestaurantId(id);
    }

}
