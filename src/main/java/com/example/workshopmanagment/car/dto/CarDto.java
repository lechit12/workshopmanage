package com.example.workshopmanagment.car.dto;

import lombok.Builder;

@Builder
public record CarDto(String carId,String make,String model,String modelYear,String mileage,String vinNumber,String repairStatus) {
}
