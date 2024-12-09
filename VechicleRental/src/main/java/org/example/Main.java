package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Vehicle Rental System Menu ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Add Customer");
            System.out.println("3. Display Vehicles");
            System.out.println("4. Display Customers");
            System.out.println("5. Rent Vehicle");
            System.out.println("6. Return Vehicle");
            System.out.println("7. Search Vehicle");
            System.out.println("8. Display Available Vehicle Count");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Vehicle
                    System.out.print("Enter Vehicle ID: ");
                    scanner.nextLine(); // Consume newline
                    String vehicleId = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Type: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Daily Rate: ");
                    double dailyRate = scanner.nextDouble();
                    rentalSystem.addVehicle(vehicleId, model, type, dailyRate);
                    System.out.println("Vehicle added successfully.");
                    break;

                case 2:
                    // Add Customer
                    System.out.print("Enter Customer Name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter Customer ID: ");
                    String customerId = scanner.nextLine();
                    rentalSystem.addCustomer(name, customerId);
                    System.out.println("Customer added successfully.");
                    break;

                case 3:
                    // Display Vehicles
                    System.out.println("\n--- List of Vehicles ---");
                    rentalSystem.getVehicles().forEach(System.out::println);
                    break;

                case 4:
                    // Display Customers
                    System.out.println("\n--- List of Customers ---");
                    rentalSystem.getCustomers().forEach(System.out::println);
                    break;

                case 5:
                    // Rent Vehicle
                    System.out.print("Enter Vehicle ID to rent: ");
                    scanner.nextLine(); // Consume newline
                    String rentVehicleId = scanner.nextLine();
                    System.out.print("Enter Customer ID: ");
                    String rentCustomerId = scanner.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int days = scanner.nextInt();
                    String rentResult = rentalSystem.rentVehicle(rentVehicleId, rentCustomerId, days);
                    System.out.println(rentResult);
                    break;

                case 6:
                    // Return Vehicle
                    System.out.print("Enter Vehicle ID to return: ");
                    scanner.nextLine(); // Consume newline
                    String returnVehicleId = scanner.nextLine();
                    String returnResult = rentalSystem.returnVehicle(returnVehicleId);
                    System.out.println(returnResult);
                    break;

                case 7:
                    // Search Vehicle
                    System.out.print("Enter Model or Type to search: ");
                    scanner.nextLine(); // Consume newline
                    String keyword = scanner.nextLine();
                    String searchResult = rentalSystem.searchVehicle(keyword);
                    System.out.println(searchResult);
                    break;

                case 8:
                    // Display Available Vehicle Count
                    int availableCount = rentalSystem.getAvailableVehicleCount();
                    System.out.println("Total Available Vehicles: " + availableCount);
                    break;

                case 9:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
