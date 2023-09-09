package com.example.workshopmanagment.car;


import com.example.workshopmanagment.car.dto.CarResponseDto;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    Car save(Car car);

    Optional<Car> findCarByVin(String vinNumber);

    List<Car> findAllCars();

    Car delete(Car car);
    Car isDueForOilChange(boolean isDueForOilChange);
}
