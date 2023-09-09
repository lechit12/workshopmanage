package com.example.workshopmanagment.car;

import lombok.Getter;

@Getter
public class CarNotFoundException extends RuntimeException {

    private final String vinNumber;
    public CarNotFoundException(String vinNumber) {
        super(String.format("Car with vin number %s not found",vinNumber));
        this.vinNumber=vinNumber;

    }


}
