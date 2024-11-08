package com.example.PhoneValidationProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Change the mapping path to avoid conflict
    @GetMapping("/phone-validation") 
    public String validatePhone() {
        return "Phone validation service is running!";
    }
}

