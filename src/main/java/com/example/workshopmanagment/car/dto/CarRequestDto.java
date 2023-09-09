package com.example.workshopmanagment.car.dto;

import lombok.Builder;

@Builder
public record CarRequestDto(String make,String model,String modelYear,String mileage,String vinNumber,boolean isDueForOilChange) {
}
