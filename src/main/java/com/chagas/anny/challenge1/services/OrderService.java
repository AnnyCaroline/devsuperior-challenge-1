package com.chagas.anny.challenge1.services;

import com.chagas.anny.challenge1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountPercentage = order.getDiscount() * 0.01;
        return ((1-discountPercentage)*order.getBasic()) + shippingService.shipment(order);
    }
}
