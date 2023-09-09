package com.example.workshopmanagment.car;

import lombok.Builder;

@Builder
record Car(String carId, String make, String model, String modelYear, String mileage, String vinNumber,boolean isDueForOilChange) {
}
