package com.example.workshopmanagment.controllers;

import com.example.workshopmanagment.customer.dto.CustomerResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomersRepository extends JpaRepository<CustomerResponseDto,Long> {

    CustomerResponseDto save(CustomerResponseDto customerResponseDto);

    List<CustomerResponseDto> findAll();
}
