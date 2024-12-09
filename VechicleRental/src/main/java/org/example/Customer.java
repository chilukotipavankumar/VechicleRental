package org.example;

import java.util.Objects;

public class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        validateInput(name, "Name");
        validateInput(customerId, "Customer ID");
        this.name = name;
        this.customerId = customerId;
    }

    private void validateInput(String input, String fieldName) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateInput(name, "Name");
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        validateInput(customerId, "Customer ID");
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(customerId, customer.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, customerId);
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}
