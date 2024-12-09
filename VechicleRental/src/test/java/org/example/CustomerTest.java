package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void testConstructorWithValidInput() {
        Customer customer = new Customer("John Doe", "C123");
        assertNotNull(customer);
        assertEquals("John Doe", customer.getName());
        assertEquals("C123", customer.getCustomerId());
    }

    @Test
    void testConstructorWithNullValues() {
        assertThrows(IllegalArgumentException.class, () -> new Customer(null, "C123"));
        assertThrows(IllegalArgumentException.class, () -> new Customer("John Doe", null));
        assertThrows(IllegalArgumentException.class, () -> new Customer(null, null));
    }

    @Test
    void testConstructorWithEmptyValues() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("", "C123"));
        assertThrows(IllegalArgumentException.class, () -> new Customer("John Doe", ""));
        assertThrows(IllegalArgumentException.class, () -> new Customer("", ""));
    }

    @Test
    void testSetName() {
        Customer customer = new Customer("John Doe", "C123");
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());
    }

    @Test
    void testSetNameWithInvalidInput() {
        Customer customer = new Customer("John Doe", "C123");
        assertThrows(IllegalArgumentException.class, () -> customer.setName(null));
        assertThrows(IllegalArgumentException.class, () -> customer.setName(""));
        assertThrows(IllegalArgumentException.class, () -> customer.setName("   "));
    }

    @Test
    void testSetCustomerId() {
        Customer customer = new Customer("John Doe", "C123");
        customer.setCustomerId("C456");
        assertEquals("C456", customer.getCustomerId());
    }

    @Test
    void testSetCustomerIdWithInvalidInput() {
        Customer customer = new Customer("John Doe", "C123");
        assertThrows(IllegalArgumentException.class, () -> customer.setCustomerId(null));
        assertThrows(IllegalArgumentException.class, () -> customer.setCustomerId(""));
        assertThrows(IllegalArgumentException.class, () -> customer.setCustomerId("   "));
    }

    @Test
    void testEqualsAndHashCode() {
        Customer customer1 = new Customer("John Doe", "C123");
        Customer customer2 = new Customer("John Doe", "C123");
        Customer customer3 = new Customer("Jane Doe", "C456");

        // Test equals
        assertTrue(customer1.equals(customer2));
        assertTrue(customer2.equals(customer1));
        assertFalse(customer1.equals(customer3));
        assertFalse(customer1.equals(null));
        assertFalse(customer1.equals(new Object()));

        // Test hashCode
        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertNotEquals(customer1.hashCode(), customer3.hashCode());
    }

    @Test
    void testToStringWithDifferentValues() {
        Customer customer1 = new Customer("John Doe", "C123");
        Customer customer2 = new Customer("Jane Doe", "C456");

        assertEquals("Customer ID: C123, Name: John Doe", customer1.toString());
        assertEquals("Customer ID: C456, Name: Jane Doe", customer2.toString());
    }

    @Test
    void testWithSpecialCharacters() {
        Customer customer = new Customer("John@Doe#123", "C!@#$%");
        assertEquals("John@Doe#123", customer.getName());
        assertEquals("C!@#$%", customer.getCustomerId());
    }


}
