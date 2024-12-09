package org.example;

import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static ByteArrayOutputStream outContent;
    private static PrintStream originalOut;
    private static InputStream originalIn;

    @BeforeAll
    static void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        originalIn = System.in;
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    static void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @BeforeEach
    void resetStreams() {
        outContent.reset();
    }

    private void simulateUserInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    void testAddVehicle() {
        simulateUserInput("1\nV1\nToyota Camry\nSedan\n50.0\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Vehicle added successfully."), "Vehicle was not added successfully.");
    }

    @Test
    void testAddCustomer() {
        simulateUserInput("2\nJohn Doe\nC1\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Customer added successfully."), "Customer was not added successfully.");
    }

    @Test
    void testDisplayVehiclesEmpty() {
        simulateUserInput("3\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("--- List of Vehicles ---"), "Vehicle display header missing.");
        assertFalse(output.contains("V1"), "Vehicles should be empty but aren't.");
    }

    @Test
    void testDisplayCustomersEmpty() {
        simulateUserInput("4\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("--- List of Customers ---"), "Customer display header missing.");
        assertFalse(output.contains("John Doe"), "Customers should be empty but aren't.");
    }

    @Test
    void testRentVehicle() {
        simulateUserInput("1\nV1\nToyota Camry\nSedan\n50.0\n2\nJohn Doe\nC1\n5\nV1\nC1\n3\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Vehicle added successfully."), "Vehicle was not added.");
        assertTrue(output.contains("Customer added successfully."), "Customer was not added.");
        assertTrue(output.contains("Vehicle rented successfully."), "Vehicle was not rented successfully.");
    }

    @Test
    void testReturnVehicle() {
        simulateUserInput("1\nV1\nToyota Camry\nSedan\n50.0\n2\nJohn Doe\nC1\n5\nV1\nC1\n3\n6\nV1\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Vehicle added successfully."), "Vehicle was not added.");
        assertTrue(output.contains("Customer added successfully."), "Customer was not added.");
        assertTrue(output.contains("Vehicle rented successfully."), "Vehicle was not rented.");
        assertTrue(output.contains("Vehicle returned successfully."), "Vehicle was not returned successfully.");
    }

    @Test
    void testSearchVehicle() {
        simulateUserInput("1\nV1\nToyota Camry\nSedan\n50.0\n7\nCamry\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Vehicle added successfully."), "Vehicle was not added.");
        assertTrue(output.contains("Toyota Camry"), "Search result does not contain the expected vehicle.");
    }

    @Test
    void testInvalidChoice() {
        simulateUserInput("99\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Invalid choice. Please try again."), "Invalid choice message missing.");
    }

    @Test
    void testExitProgram() {
        simulateUserInput("9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Exiting the program. Goodbye!"), "Exit message missing.");
    }

    @Test
    void testAvailableVehicleCount() {
        simulateUserInput("1\nV1\nToyota Camry\nSedan\n50.0\n8\n9\n");
        Main.main(new String[]{});
        String output = outContent.toString();
        assertTrue(output.contains("Total Available Vehicles: 1"), "Available vehicle count is incorrect.");
    }
}
