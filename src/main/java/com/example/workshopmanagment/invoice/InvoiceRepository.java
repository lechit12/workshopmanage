package com.example.workshopmanagment.invoice;

import com.example.workshopmanagment.invoice.dto.InvoiceDto;

import java.util.Optional;

public interface InvoiceRepository {


    Optional<Invoice> findInvoiceById(String invoiceId);

    Optional<Invoice> findInvoiceByNip(String nipNumber);
}
