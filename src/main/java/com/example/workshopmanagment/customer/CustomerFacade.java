package com.example.workshopmanagment.customer;

import com.example.workshopmanagment.car.CarFacade;
import com.example.workshopmanagment.customer.dto.CustomerDto;

import lombok.AllArgsConstructor;

import java.util.*;

import static java.util.UUID.randomUUID;


@AllArgsConstructor
public class CustomerFacade {

    private final CustomerRepository repository;

    private Set<CarFacade> carFacades = new HashSet<>();
    private Set<Customer> customers = new HashSet<>();


    public CustomerDto addCustomer(Set<Customer> dataFromUser) {
        String customerId = randomUUID().toString();

        String firstName = null;
        String lastName = null;
        String email = null;
        String phone = "232";
        String address = null;
        Customer savedCustomer = repository.save(new Customer(customerId, firstName, lastName, email, phone, address));
        return CustomerDto.builder()
                .firstName(savedCustomer.firstName())
                .lastName(savedCustomer.lastName())
                .email(savedCustomer.email())
                .phone(savedCustomer.phone())
                .address(savedCustomer.address())
                .build();

    }


    public CustomerDto deleteCustomer() {
        return null;
    }

    public CustomerDto findAllCustomers(List<CustomerDto> customers) {
        return null;
    }

    public Optional<CustomerDto> findCustomerById(String customerId) {
        return null;
    }


}
