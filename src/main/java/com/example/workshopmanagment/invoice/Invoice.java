package com.example.workshopmanagment.invoice;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.customer.dto.CustomerDto;
import lombok.Builder;

@Builder
record Invoice(String invoiceId, String nipNumber, String repairCost, CustomerDto customerDto, CarDto carDto) {
}
