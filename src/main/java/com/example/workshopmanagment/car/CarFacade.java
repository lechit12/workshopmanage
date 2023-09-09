package com.example.workshopmanagment.car;

import com.example.workshopmanagment.car.dto.CarRequestDto;
import com.example.workshopmanagment.car.dto.CarResponseDto;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@AllArgsConstructor
public class CarFacade {

    private final CarRepository repository;
    private final int  OIL_CHANGE_INTERVAL= 10000;

    public List<CarResponseDto> findAllCars() {
        return repository.findAllCars()
                .stream()
                .map(CarMapper::mapFromCartoCarDto)
                .toList();
    }

    public CarResponseDto findCarByVin(String vinNumber) {

        return repository.findCarByVin(vinNumber)
                .map(CarMapper::mapFromCartoCarDto)
                .orElseThrow(() -> new CarNotFoundException(vinNumber));
    }

    public CarResponseDto saveCar(CarRequestDto carRequestDto) {
        final Car car = CarMapper.mapFromCarDtotoCar(carRequestDto);
        final Car save = repository.save(car);
        return CarMapper.mapFromCartoCarDto(save);
    }

    public CarResponseDto deleteCar(CarRequestDto carRequestDto) {
        final Car car = CarMapper.mapFromCarDtotoCar(carRequestDto);
        final Car delete = repository.delete(car);
        return CarMapper.mapFromCartoCarDto(delete);
    }

    public CarResponseDto isDueForOilChange(IsDueForOilChange isDueForOilChange) {

    }


}
