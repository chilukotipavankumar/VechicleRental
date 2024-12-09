package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentalSystemTest {
    private RentalSystem rentalSystem;

    @BeforeEach
    void setUp() {
        rentalSystem = new RentalSystem();
    }

    // Step 1: Test initialization
    @Test
    void testInitialization() {
        assertNotNull(rentalSystem.getVehicles());
        assertNotNull(rentalSystem.getCustomers());
        assertTrue(rentalSystem.getVehicles().isEmpty());
        assertTrue(rentalSystem.getCustomers().isEmpty());
    }

    // Step 2: Test adding vehicles
    @Test
    void testAddVehicle() {
        rentalSystem.addVehicle("V1", "Toyota Camry", "Sedan", 50.0);
        assertEquals(1, rentalSystem.getVehicles().size());
        Vehicle vehicle = rentalSystem.getVehicles().get(0);
        assertEquals("V1", vehicle.getVehicleId());
        assertEquals("Toyota Camry", vehicle.getModel());
        assertEquals("Sedan", vehicle.getType());
        assertEquals(50.0, vehicle.getDailyRate());
    }

    // Step 3: Test adding customers
    @Test
    void testAddCustomer() {
        rentalSystem.addCustomer("John Doe", "C1");
        assertEquals(1, rentalSystem.getCustomers().size());
        Customer customer = rentalSystem.getCustomers().get(0);
        assertEquals("John Doe", customer.getName());
        assertEquals("C1", customer.getCustomerId());
    }

    // Step 4: Test renting vehicles
    @Test
    void testRentVehicle() {
        // Setup
        rentalSystem.addVehicle("V1", "Toyota Camry", "Sedan", 50.0);
        rentalSystem.addCustomer("John Doe", "C1");

        // Test successful rental
        String result = rentalSystem.rentVehicle("V1", "C1", 3);
        assertTrue(result.contains("Vehicle rented successfully"));
        assertTrue(result.contains("Total Cost: $150.0"));

        // Test renting already rented vehicle
        result = rentalSystem.rentVehicle("V1", "C1", 3);
        assertEquals("Vehicle is already rented.", result);
    }

    // Step 5: Test vehicle return
    @Test
    void testReturnVehicle() {
        rentalSystem.addVehicle("V1", "Toyota Camry", "Sedan", 50.0);
        rentalSystem.addCustomer("John Doe", "C1");

        rentalSystem.rentVehicle("V1", "C1", 3);
        String result = rentalSystem.returnVehicle("V1");
        assertEquals("Vehicle returned successfully.", result);

        // Test returning already available vehicle
        result = rentalSystem.returnVehicle("V1");
        assertEquals("Vehicle is already available.", result);
    }

    // Step 6: Test error cases
    @Test
    void testErrorCases() {
        // Test non-existent vehicle
        String result = rentalSystem.rentVehicle("V999", "C1", 3);
        assertEquals("Vehicle with ID V999 not found.", result);

        // Test non-existent customer
        rentalSystem.addVehicle("V1", "Toyota Camry", "Sedan", 50.0);
        result = rentalSystem.rentVehicle("V1", "C999", 3);
        assertEquals("Customer with ID C999 not found.", result);

        // Test returning non-existent vehicle
        result = rentalSystem.returnVehicle("V999");
        assertEquals("Vehicle with ID V999 not found.", result);
    }

    // Step 7: Test vehicle search
    @Test
    void testSearchVehicle() {
        rentalSystem.addVehicle("V1", "Toyota Camry", "Sedan", 50.0);
        rentalSystem.addVehicle("V2", "Honda Civic", "Sedan", 45.0);
        rentalSystem.addVehicle("V3", "Ford F-150", "Truck", 70.0);

        // Test search by model
        String result = rentalSystem.searchVehicle("Camry");
        assertTrue(result.contains("Toyota Camry"), "Expected result to contain 'Toyota Camry'.");
        assertFalse(result.contains("Honda Civic"), "Result should not contain 'Honda Civic'.");

        // Test search by type
        result = rentalSystem.searchVehicle("Sedan");
        assertTrue(result.contains("Toyota Camry"), "Expected result to contain 'Toyota Camry'.");
        assertTrue(result.contains("Honda Civic"), "Expected result to contain 'Honda Civic'.");
        assertFalse(result.contains("Ford F-150"), "Result should not contain 'Ford F-150'.");

        // Test search with no matches
        result = rentalSystem.searchVehicle("SUV");
        assertEquals("No vehicles match the keyword \"SUV\".", result, "Expected no matches for 'SUV'.");
    }


    // Step 8: Test available vehicle count
    @Test
    void testGetAvailableVehicleCount() {
        rentalSystem.addVehicle("V1", "Toyota Camry", "Sedan", 50.0);
        rentalSystem.addVehicle("V2", "Honda Civic", "Sedan", 45.0);
        assertEquals(2, rentalSystem.getAvailableVehicleCount());

        rentalSystem.addCustomer("John Doe", "C1");
        rentalSystem.rentVehicle("V1", "C1", 3);
        assertEquals(1, rentalSystem.getAvailableVehicleCount());
    }

}
