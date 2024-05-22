package mk.ukim.finki.emt.reservationscatalog.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Customer;
import mk.ukim.finki.emt.reservationscatalog.domain.models.CustomerId;
import mk.ukim.finki.emt.reservationscatalog.domain.repository.CustomerRepository;
import mk.ukim.finki.emt.reservationscatalog.services.CustomerService;
import mk.ukim.finki.emt.reservationscatalog.services.forms.CustomerForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public CustomerId addCustomer(CustomerForm customerForm) {
        Customer customer = Customer.build(
                customerForm.getName(),
                customerForm.getPhone(),
                customerForm.getEmail()
        );
        customerRepository.save(customer);
        return customer.getId();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(CustomerId id) {
        return customerRepository.findById(id);
    }
}
