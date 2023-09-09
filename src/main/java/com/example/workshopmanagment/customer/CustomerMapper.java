package com.example.workshopmanagment.customer;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.customer.dto.CustomerDto;
import com.example.workshopmanagment.customer.dto.CustomerResultDto;

public class CustomerMapper {



    public static Customer mapFromCustomerDtotoCustomer(CustomerDto customerDto)
    {
        return Customer.builder()
                .customerId(customerDto.customerId())
                .firstName(customerDto.firstName())
                .lastName(customerDto.lastName())
                .phone(customerDto.phone())
                .address(customerDto.address())
                .email(customerDto.email())
                .build();
    }

    public static CustomerDto mapFromCustomerToCustomerDto(Customer customer)
    {
        return CustomerDto.builder()
                .customerId(customer.customerId())
                .firstName(customer.firstName())
                .lastName(customer.lastName())
                .email(customer.email())
                .address(customer.address())
                .phone(customer.phone())
                .build();
    }
}
