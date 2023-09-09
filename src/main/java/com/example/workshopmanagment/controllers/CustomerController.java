package com.example.workshopmanagment.controllers;


import com.example.workshopmanagment.customer.dto.CustomerResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {


     private CustomersRepository customersRepository;

    @GetMapping("/add")
    public String showAddCustomerForm(Model model) {
        model.addAttribute("customer", new CustomerResponseDto());
        return "add-customer";
    }

    @PostMapping("/add")
    public String addCustomer(@ModelAttribute("customer") CustomerResponseDto customerResponseDto) {
        customersRepository.save(customerResponseDto);
        return "redirect:/customers";
    }

    @GetMapping
    public String showCustomers(Model model) throws SQLException {
        List<CustomerResponseDto> customers = (List<CustomerResponseDto>) customersRepository.findAll();
        model.addAttribute("customers", customers);
        return "customers";
    }
}