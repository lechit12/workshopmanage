package com.example.workshopmanagment.car;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.car.dto.CarRequestDto;
import com.example.workshopmanagment.car.dto.CarResponseDto;

public class CarMapper {


    public static Car mapFromCarDtotoCar(CarRequestDto carRequestDto)
    {
        return Car.builder()
                .make(carRequestDto.make())
                .model(carRequestDto.model())
                .modelYear(carRequestDto.modelYear())
                .mileage(carRequestDto.mileage())
                .vinNumber(carRequestDto.vinNumber())
                .isDueForOilChange(carRequestDto.isDueForOilChange())
                .build();
    }
    public static CarResponseDto mapFromCartoCarDto(Car car)
    {
        return CarResponseDto.builder()
                .carId(car.carId())
                .make(car.make())
                .model(car.model())
                .modelYear(car.modelYear())
                .mileage(car.mileage())
                .vinNumber(car.vinNumber())
                .isDueForOilChange(car.isDueForOilChange())
                .build();
    }
}
