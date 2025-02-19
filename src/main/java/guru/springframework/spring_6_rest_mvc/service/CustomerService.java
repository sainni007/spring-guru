package guru.springframework.spring_6_rest_mvc.service;

import guru.springframework.spring_6_rest_mvc.model.Customer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {
    Optional<Customer> getCustomerById(UUID uuid);

    List<Customer> getAllCustomers();
}
