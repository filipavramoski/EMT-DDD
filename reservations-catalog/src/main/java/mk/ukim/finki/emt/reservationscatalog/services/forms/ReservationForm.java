package mk.ukim.finki.emt.reservationscatalog.services.forms;

import lombok.Data;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.Quantity;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.RestaurantId;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.TableId;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
@Data
public class ReservationForm {
    @NotNull
    private Quantity numberOfPeople;

    @NotNull
    private Time timeOfRes;

    @NotNull
    private Date dateOfRes;

    @NotNull
    private RestaurantId restaurantId;

    @NotNull
    private TableId tableId;

}
