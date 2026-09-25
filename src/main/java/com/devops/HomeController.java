package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello from Jenkins CI/CD - version 2 , Maven Application is Running Successfully.";
    }
}
