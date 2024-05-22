package mk.ukim.finki.emt.reservationscatalog.services.forms;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CustomerForm {
    @NotNull
    private String name;
    @NotNull
    private String phone;
    @NotNull
    private String email;
}
