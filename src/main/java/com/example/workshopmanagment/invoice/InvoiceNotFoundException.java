package com.example.workshopmanagment.invoice;

public class InvoiceNotFoundException extends RuntimeException{
    private final String invoiceId;
    public InvoiceNotFoundException(String invoiceId) {
        super(String.format("Invoice with id %s not found",invoiceId));
        this.invoiceId=invoiceId;
    }

}
