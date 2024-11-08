package com.example.PhoneValidationProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneValidationController {

    // Mapping for /validate endpoint
    @GetMapping("/validate")
    public String validatePhoneNumber(@RequestParam("phoneNumber") String phoneNumber) {
        // Your phone number validation logic goes here
        // For example, just returning the phone number for now
        return "Phone number " + phoneNumber + " is valid.";
    }
}

