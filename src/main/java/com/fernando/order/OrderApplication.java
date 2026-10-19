package com.fernando.order;

import com.fernando.order.entities.Order;
import com.fernando.order.services.OrderService;
import com.fernando.order.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

    private final OrderService orderService;

    public OrderApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int code = 1034;
        Double basic = 95.90;
        Double discount = 0.0;

        Order order = new Order(code, basic, discount);

        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService(shippingService);

        System.out.println("Pedido código: " + code);
        System.out.println("Valor total: " + orderService.total(order));
    }
}
