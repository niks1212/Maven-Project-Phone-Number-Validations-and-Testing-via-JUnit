package example;

import com.example.PhoneValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneValidatorTest {

    private final PhoneValidator validator = new PhoneValidator();  // Instantiate validator

    @Test
    public void testValidPhoneNumber() {
        assertTrue(validator.isValidPhoneNumber("+1234567890"));     // Exactly 10 digits
        assertTrue(validator.isValidPhoneNumber("+123456789012"));   // More digits, up to 15
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertFalse(validator.isValidPhoneNumber("1234567890"));     // Missing "+"
        assertFalse(validator.isValidPhoneNumber("+12345"));         // Too few digits
        assertFalse(validator.isValidPhoneNumber("+1234567890123456")); // Too many digits
        assertFalse(validator.isValidPhoneNumber(null));             // Null case
        assertFalse(validator.isValidPhoneNumber("+123abc7890"));    // Contains non-digits
    }
}


