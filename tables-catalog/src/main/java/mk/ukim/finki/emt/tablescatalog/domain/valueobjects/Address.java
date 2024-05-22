package mk.ukim.finki.emt.tablescatalog.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Address implements ValueObject {
    String street;
    String streetNo;
    String city;
    String postalCode;

    protected Address() {}

    public Address(String street, String streetNo, String city, String postalCode) {
        this.street = street;
        this.streetNo = streetNo;
        this.city = city;
        this.postalCode = postalCode;
    }
    public String getAddressFormat() {
        return street + " " + streetNo + ", " + postalCode + " " + city;
    }
}
