package mk.ukim.finki.emt.reservationscatalog.services;

import mk.ukim.finki.emt.reservationscatalog.domain.models.Customer;
import mk.ukim.finki.emt.reservationscatalog.domain.models.CustomerId;
import mk.ukim.finki.emt.reservationscatalog.services.forms.CustomerForm;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    CustomerId addCustomer(CustomerForm customerForm);
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(CustomerId id);
}
