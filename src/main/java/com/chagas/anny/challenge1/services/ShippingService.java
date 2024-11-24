package com.chagas.anny.challenge1.services;

import com.chagas.anny.challenge1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public ShippingService() {
    }

    public double shipment(Order order){
        double orderBasic = order.getBasic();

        if (orderBasic < 100) {
            return 20.00;
        } else if (orderBasic < 200) {
            return 12.00;
        } else {
            return 0.00;
        }
    }

}
