package com.example.workshopmanagment.invoice.dto;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.customer.dto.CustomerDto;
import lombok.Builder;

@Builder
public record InvoiceResponseDto(String nipNumber, String repairCost, CarDto carDto, CustomerDto customerDto ) {
}
