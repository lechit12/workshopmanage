package com.example.workshopmanagment.order;

import com.example.workshopmanagment.car.CarFacade;
import com.example.workshopmanagment.customer.CustomerFacade;
import com.example.workshopmanagment.order.dto.OrderDto;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Optional;

@AllArgsConstructor
public class OrderFacade {


    public OrderDto findAllOrders() {
        return null;
    }

    public Optional<OrderDto> findOrderById() {
        return null;
    }

    public OrderDto makeNewOrder() {
        return null;
    }


    public boolean isCompleted() {
        return false;
    }

    public boolean isOrderPaid()
    {
        return false;
    }

    public double generateRepairCost() {
        return 0;
    }



}
