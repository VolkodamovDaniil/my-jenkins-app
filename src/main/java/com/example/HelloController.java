package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String home() {
        return "Welcome to My Jenkins App!";
    }
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s! This is Jenkins pipeline demo.", name);
    }
    
    @GetMapping("/health")
    public String health() {
        return "{\"status\": \"UP\", \"service\": \"my-jenkins-app\"}";
    }
}