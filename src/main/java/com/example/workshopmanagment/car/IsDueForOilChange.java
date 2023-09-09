package com.example.workshopmanagment.car;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IsDueForOilChange {

    private final Car car;

    public boolean isDue()
    {
        int upperLimitOilChange=10000;
        int mileageFromLastOilChange= Integer.parseInt(car.mileage());
        if(mileageFromLastOilChange>=upperLimitOilChange)
        {
            return true;
        }
        else return false;
    }
}
