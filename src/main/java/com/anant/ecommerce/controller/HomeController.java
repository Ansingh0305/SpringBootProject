package com.anant.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Ecommerce Backend API is Running</h1>" +
               "<p>Use the <a href='file:///home/anant/Desktop/project/verification.html'>Verification Dashboard</a> to test endpoints.</p>" +
               "<p>Available endpoints: /api/products, /api/cart, /api/orders</p>";
    }
}
