package com.example.workshopmanagment.invoice;

import com.example.workshopmanagment.car.dto.CarDto;
import com.example.workshopmanagment.invoice.dto.InvoiceRequestDto;
import com.example.workshopmanagment.invoice.dto.InvoiceResponseDto;

public class InvoiceMapper {


    public static InvoiceResponseDto mapFromInvoiceToInvoiceDto(Invoice invoice)
    {
        return InvoiceResponseDto.builder()
                .nipNumber(invoice.nipNumber())
                .repairCost(invoice.repairCost())
                .customerDto(invoice.customerDto())
                .carDto(invoice.carDto())
                .build();
    }
    public static Invoice mapFromInvoiceDtoToInvoice(InvoiceRequestDto invoiceRequestDto)
    {
        return Invoice.builder()
                .invoiceId(invoiceRequestDto.invoiceId())
                .nipNumber(invoiceRequestDto.nipNumber())
                .customerDto(invoiceRequestDto.customerDto())
                .carDto(invoiceRequestDto.carDto())
                .repairCost(invoiceRequestDto.repairCost())
                .build();
    }
}
