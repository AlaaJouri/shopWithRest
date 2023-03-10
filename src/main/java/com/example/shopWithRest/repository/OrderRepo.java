package com.example.shopWithRest.repository;

import com.example.shopWithRest.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepo {
    private final Map<Integer, Order> orders = new HashMap<>();

    public Order addOrder(Order order) {
        orders.put(order.id(), order);
        return order;
    }

    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }

    public List<Order> listOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order deleteOrder(int id) {
        return orders.remove(id);
    }
}
