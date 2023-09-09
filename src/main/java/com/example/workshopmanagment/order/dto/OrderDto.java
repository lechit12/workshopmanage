package com.example.workshopmanagment.order.dto;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.customer.dto.CustomerDto;
import lombok.Builder;

@Builder
public record OrderDto(String orderId, String orderTotalCost,String orderStatus, CustomerDto customerDto, CarDto carDto) {
}
