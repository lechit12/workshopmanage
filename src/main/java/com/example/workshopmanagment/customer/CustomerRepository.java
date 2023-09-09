package com.example.workshopmanagment.customer;

import com.example.workshopmanagment.customer.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);

    Optional<Customer> findCustomerById(String customerId);

    Customer findAllCustomers(List<Customer> customers);


}
