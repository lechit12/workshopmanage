package com.example.workshopmanagment.customer;


import lombok.Builder;

@Builder
record Customer(String customerId, String firstName, String lastName, String email, String phone, String address) {

}
