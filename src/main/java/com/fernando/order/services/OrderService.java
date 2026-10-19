package com.fernando.order.services;

import com.fernando.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order) {
        Double discount = (order.getBasic() * order.getDiscount()) / 100.0;

        Double price = order.getBasic() - discount;

        return price + shippingService.shipment(order);
    }
}
