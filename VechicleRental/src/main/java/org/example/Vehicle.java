package org.example;

import java.util.Objects;

public class Vehicle {
    private String vehicleId;
    private String model;
    private String type;
    private boolean isAvailable;
    private double dailyRate;

    public Vehicle(String vehicleId, String model, String type, double dailyRate) {
        validateInput(vehicleId, "Vehicle ID");
        validateInput(model, "Model");
        validateInput(type, "Type");
        validateDailyRate(dailyRate);

        this.vehicleId = vehicleId;
        this.model = model;
        this.type = type;
        this.dailyRate = dailyRate;
        this.isAvailable = true;
    }

    private void validateInput(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }



    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        validateInput(model, "Model");
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        validateInput(type, "Type");
        this.type = type;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    private void validateDailyRate(double rate) {
        if (rate < 0) {
            throw new IllegalArgumentException("Daily rate cannot be negative");
        }
        if (Double.isInfinite(rate) || Double.isNaN(rate)) {
            throw new IllegalArgumentException("Daily rate must be a valid finite number");
        }
        // Optional: Add a reasonable upper limit
        if (rate > 1000000) { // Example limit of 1 million
            throw new IllegalArgumentException("Daily rate exceeds maximum allowed value");
        }
    }

    public void setDailyRate(double dailyRate) {
        validateDailyRate(dailyRate);
        this.dailyRate = dailyRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentVehicle() {
        if (!isAvailable) {
            throw new IllegalStateException("Vehicle is already rented");
        }
        isAvailable = false;
    }

    public void returnVehicle() {
        if (isAvailable) {
            throw new IllegalStateException("Vehicle is already returned");
        }
        isAvailable = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.dailyRate, dailyRate) == 0 &&
                isAvailable == vehicle.isAvailable &&
                Objects.equals(vehicleId, vehicle.vehicleId) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, model, type, isAvailable, dailyRate);
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Model: %s, Type: %s, Daily Rate: $%.1f, Status: %s",
                vehicleId, model, type, dailyRate, (isAvailable ? "Available" : "Rented"));
    }
}
