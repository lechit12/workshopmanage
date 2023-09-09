package com.example.workshopmanagment.customer.dto;


import lombok.Builder;

import java.util.Set;

@Builder
public record CustomerDto(String customerId, String firstName, String lastName, String email, String phone, String address) {

}
