package com.example.workshopmanagment.invoice.dto;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.customer.dto.CustomerDto;
import lombok.Builder;

@Builder
public record InvoiceDto(String invoiceId, String nipNumber, String repairCost,String paymentStatus, CustomerDto customerDto, CarDto carDto) {
}
