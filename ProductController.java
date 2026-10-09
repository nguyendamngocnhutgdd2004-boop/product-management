package com.example.productmanagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot Project Initialized Successfully!";
    }
}