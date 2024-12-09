package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
        vehicle = new Vehicle("V001", "Model S", "Sedan", 150.0);
    }

    @Test
    void testConstructorWithValidInput() {
        assertNotNull(vehicle);
        assertEquals("V001", vehicle.getVehicleId());
        assertEquals("Model S", vehicle.getModel());
        assertEquals("Sedan", vehicle.getType());
        assertEquals(150.0, vehicle.getDailyRate());
        assertTrue(vehicle.isAvailable());
    }

    @Test
    void testConstructorWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle(null, "Model S", "Sedan", 150.0));
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("", "Model S", "Sedan", 150.0));
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("V001", null, "Sedan", 150.0));
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("V001", "Model S", null, 150.0));
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("V001", "Model S", "Sedan", -150.0));
    }

    @Test
    void testSetters() {
        vehicle.setModel("New Model");
        assertEquals("New Model", vehicle.getModel());

        vehicle.setType("SUV");
        assertEquals("SUV", vehicle.getType());

        vehicle.setDailyRate(200.0);
        assertEquals(200.0, vehicle.getDailyRate());
    }

    @Test
    void testSettersWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () ->
                vehicle.setModel(null));
        assertThrows(IllegalArgumentException.class, () ->
                vehicle.setModel(""));
        assertThrows(IllegalArgumentException.class, () ->
                vehicle.setType(null));
        assertThrows(IllegalArgumentException.class, () ->
                vehicle.setType(""));
        assertThrows(IllegalArgumentException.class, () ->
                vehicle.setDailyRate(-1.0));
    }

    @Test
    void testRentAndReturnVehicle() {
        assertTrue(vehicle.isAvailable());

        vehicle.rentVehicle();
        assertFalse(vehicle.isAvailable());

        vehicle.returnVehicle();
        assertTrue(vehicle.isAvailable());
    }

    @Test
    void testMultipleRentAndReturn() {
        vehicle.rentVehicle();
        assertThrows(IllegalStateException.class, () ->
                vehicle.rentVehicle());

        vehicle.returnVehicle();
        assertThrows(IllegalStateException.class, () ->
                vehicle.returnVehicle());
    }

    @Test
    void testToStringAllStates() {
        String availableString = "ID: V001, Model: Model S, Type: Sedan, Daily Rate: $150.0, Status: Available";
        assertEquals(availableString, vehicle.toString());

        vehicle.rentVehicle();
        String rentedString = "ID: V001, Model: Model S, Type: Sedan, Daily Rate: $150.0, Status: Rented";
        assertEquals(rentedString, vehicle.toString());
    }

    @Test
    void testEqualsAndHashCode() {
        Vehicle sameVehicle = new Vehicle("V001", "Model S", "Sedan", 150.0);
        Vehicle differentVehicle = new Vehicle("V002", "Model X", "SUV", 200.0);

        assertTrue(vehicle.equals(vehicle));
        assertTrue(vehicle.equals(sameVehicle));
        assertFalse(vehicle.equals(differentVehicle));
        assertFalse(vehicle.equals(null));
        assertFalse(vehicle.equals(new Object()));

        assertEquals(vehicle.hashCode(), sameVehicle.hashCode());
        assertNotEquals(vehicle.hashCode(), differentVehicle.hashCode());
    }

    @Test
    void testSpecialCharacters() {
        Vehicle specialVehicle = new Vehicle("V#001", "Model@S", "Sedan!", 150.0);
        assertEquals("V#001", specialVehicle.getVehicleId());
        assertEquals("Model@S", specialVehicle.getModel());
        assertEquals("Sedan!", specialVehicle.getType());
    }

    @Test
    void testBoundaryValues() {
        // Test minimum valid value
        Vehicle boundaryVehicle = new Vehicle("V001", "Model S", "Sedan", 0.0);
        assertEquals(0.0, boundaryVehicle.getDailyRate());

        // Test infinity
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("V001", "Model S", "Sedan", Double.POSITIVE_INFINITY));

        // Test NaN
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("V001", "Model S", "Sedan", Double.NaN));

        // Test very large value
        assertThrows(IllegalArgumentException.class, () ->
                new Vehicle("V001", "Model S", "Sedan", 2000000.0));
    }

}
