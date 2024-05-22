package mk.ukim.finki.emt.reservationscatalog.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.reservationscatalog.domain.models.Customer;
import mk.ukim.finki.emt.reservationscatalog.domain.repository.CustomerRepository;
import org.springframework.stereotype.Component;
@Component
@AllArgsConstructor
public class DataInitializer {
    private final CustomerRepository customerRepository;

    @PostConstruct
    public void initializeData() {

        if (customerRepository.count() == 0) {

            Customer customer1 =  Customer.build("Filip Avramoskii", "+123456789", "filip@example.com");
            Customer customer2 =  Customer.build("Ana Anovska", "+987654321", "ana@example.com");


            customerRepository.save(customer1);
            customerRepository.save(customer2);

            System.out.println("Initialized sample customers.");
        }
    }

}
