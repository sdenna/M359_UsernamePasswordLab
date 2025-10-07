import org.junit.Test;

import static org.junit.Assert.*;

public class UserInfoLabTest {

    @Test
    public void testGenerateUsername() {
        System.out.println("\nTesting Username");
        assertEquals("johsmi", UserInfoLab.generateUsername("John", "Smith"));
        assertEquals("alli", UserInfoLab.generateUsername("Al", "Li"));
        assertEquals("emmjoh", UserInfoLab.generateUsername("Emma", "Johnson"));
        assertEquals("tommcj", UserInfoLab.generateUsername("Tom", "McJava"));
        assertEquals("sarwhi", UserInfoLab.generateUsername("Sara", "White"));
    }

    @Test
    public void testValidatePassword() {
        System.out.println("\nTesting password");
        assertTrue(UserInfoLab.validatePassword("Secure123"));
        assertFalse(UserInfoLab.validatePassword("simplepass")); // No capital letter
        assertFalse(UserInfoLab.validatePassword("short1")); // Too short
        assertFalse(UserInfoLab.validatePassword("NoNumberHere!")); // No digit
        assertTrue(UserInfoLab.validatePassword("Sara1234"));
    }

    @Test
    public void testMaskCreditCard() {
        System.out.println("\nTesting credit card");
        assertEquals("**** **** **** 5678", UserInfoLab.maskCreditCard("1234567812345678"));
        assertEquals("**** **** **** 7654", UserInfoLab.maskCreditCard("9876543210987654"));
        assertEquals("**** **** **** 8888", UserInfoLab.maskCreditCard("5555666677778888"));
        assertEquals("**** **** **** 1234", UserInfoLab.maskCreditCard("1234123412341234"));
        assertEquals("N/A", UserInfoLab.maskCreditCard("876543218765")); // Invalid too short
        assertEquals("N/A", UserInfoLab.maskCreditCard("111122224444AD24")); // Invalid not all digits
    }
}