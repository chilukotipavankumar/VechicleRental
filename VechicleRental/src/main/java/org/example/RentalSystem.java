package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Vehicle> vehicles;
    private List<Customer> customers;

    public RentalSystem() {
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addVehicle(String vehicleId, String model, String type, double dailyRate) {
        vehicles.add(new Vehicle(vehicleId, model, type, dailyRate));
    }

    public void addCustomer(String name, String customerId) {
        customers.add(new Customer(name, customerId));
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public String rentVehicle(String vehicleId, String customerId, int days) {
        Vehicle vehicle = findVehicleById(vehicleId);
        Customer customer = findCustomerById(customerId);

        if (vehicle == null) {
            return "Vehicle with ID " + vehicleId + " not found.";
        }

        if (customer == null) {
            return "Customer with ID " + customerId + " not found.";
        }

        if (vehicle.isAvailable()) {
            vehicle.rentVehicle();
            double totalCost = vehicle.getDailyRate() * days;
            return "Vehicle rented successfully. Total Cost: $" + totalCost;
        } else {
            return "Vehicle is already rented.";
        }
    }

    public String returnVehicle(String vehicleId) {
        Vehicle vehicle = findVehicleById(vehicleId);

        if (vehicle == null) {
            return "Vehicle with ID " + vehicleId + " not found.";
        }

        if (!vehicle.isAvailable()) {
            vehicle.returnVehicle();
            return "Vehicle returned successfully.";
        } else {
            return "Vehicle is already available.";
        }
    }

    public String searchVehicle(String keyword) {
        StringBuilder result = new StringBuilder();
        for (Vehicle vehicle : vehicles) { // Assuming `vehicles` is a list of all vehicles in the system
            if (vehicle.getModel().contains(keyword) || vehicle.getType().contains(keyword)) {
                result.append(vehicle.toString()).append("\n");
            }
        }
        return result.length() > 0 ? result.toString() : "No vehicles match the keyword \"" + keyword + "\".";
    }


    public int getAvailableVehicleCount() {
        return (int) vehicles.stream().filter(Vehicle::isAvailable).count();
    }

    private Vehicle findVehicleById(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }

    private Customer findCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }
}
