package com.example;

public class PhoneValidator {

    // Regular expression for validating phone numbers (e.g., +1234567890)
    private static final String PHONE_PATTERN = "^\\+\\d{10,15}$";  // + followed by 10 to 15 digits

    // Method to validate phone number
    public boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            return false; // Null is considered invalid
        }
        return phoneNumber.matches(PHONE_PATTERN);  // Return true if the number matches the pattern
    }

    public static void main(String[] args) {
        // Example of using the validator
        PhoneValidator validator = new PhoneValidator();
        String testNumber = "+1234567890";  // Change this to test other numbers

        if (validator.isValidPhoneNumber(testNumber)) {
            System.out.println("The phone number is valid.");
        } else {
            System.out.println("The phone number is invalid.");
        }
    }
}

