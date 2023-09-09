package com.example.workshopmanagment.order;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.customer.dto.CustomerDto;
import lombok.Builder;

@Builder
record Order(String orderId, String orderTotalCost, CustomerDto customerDto, CarDto carDto) {
}
