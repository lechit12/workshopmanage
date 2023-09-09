package com.example.workshopmanagment.invoice;

import com.example.workshopmanagment.customer.CustomerFacade;
import com.example.workshopmanagment.invoice.dto.InvoiceDto;
import com.example.workshopmanagment.invoice.dto.InvoiceRequestDto;
import com.example.workshopmanagment.invoice.dto.InvoiceResponseDto;
import com.example.workshopmanagment.order.OrderFacade;
import com.example.workshopmanagment.car.CarFacade;
import com.example.workshopmanagment.order.dto.OrderDto;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Optional;

@AllArgsConstructor
public class InvoiceFacade {
    private double price;
    private final InvoiceRepository repository;


    public InvoiceDto findAllInvoices() {
        return null;
    }

    public InvoiceResponseDto findInvoiceById(String invoiceId) {
        return repository.findInvoiceById(invoiceId)
                .map(InvoiceMapper::mapFromInvoiceToInvoiceDto)
                .orElseThrow(() -> new InvoiceNotFoundException(invoiceId));
    }

    public InvoiceResponseDto findInvoiceByNip(String nipNumber) {

        return repository.findInvoiceByNip(nipNumber)
                .map(InvoiceMapper::mapFromInvoiceToInvoiceDto)
                .orElseThrow(()->new InvoiceNotFoundException(nipNumber));
    }

    public Optional<InvoiceDto> findInvoiceByCustomerId() {
        return null;
    }

    public Optional<InvoiceDto> findInvoiceByCarVinNumber() {
        return null;
    }

    public InvoiceDto makeNewInvoice() {
        return null;
    }

    public OrderDto retrieveRepairCost() {
        return null;
    }

    public boolean isInvoicePaid() {
        return false;
    }


}
