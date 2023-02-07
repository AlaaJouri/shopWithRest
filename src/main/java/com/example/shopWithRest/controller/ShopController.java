package com.example.shopWithRest.controller;

import com.example.shopWithRest.model.Order;
import com.example.shopWithRest.model.Product;
import com.example.shopWithRest.service.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ShopController {
    private final ShopService shopService;

    @GetMapping("products")
    public List<Product> listProducts() {
        return shopService.listProducts();
    }

    @GetMapping("products/{id}")
    public Product getProduct(@PathVariable int id) {
        return shopService.getProduct(id);
    }

    @GetMapping("orders")
    public List<Order> listOrders() {
        return shopService.listOrders();
    }

    @GetMapping("orders/{id}")
    public Order getOrder(@PathVariable int id) {
        return shopService.getOrder(id);
    }

    @PostMapping("orders/{id}")
    public void addOrder(@PathVariable int id, @RequestBody List<Integer> productIds) {
        shopService.addOrder(id, productIds);
    }
}