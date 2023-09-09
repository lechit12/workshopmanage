package com.example.workshopmanagment.customer.dto;

import com.example.workshopmanagment.car.dto.CarDto;
import lombok.Builder;

@Builder
public record CustomerResultDto(CustomerDto customerDto, CarDto carDto) {
}
