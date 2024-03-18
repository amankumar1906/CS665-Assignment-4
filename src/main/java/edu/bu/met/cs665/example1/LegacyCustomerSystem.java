package edu.bu.met.cs665.example1;

/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: LegacyCustomerSystem.java
 * Description: This class represents a legacy system for retrieving customer data via USB.
 */
public class LegacyCustomerSystem implements CustomerDataUSB {
  @Override
  public void printCustomer_USB(int customerId) {
    // Mock implementation of printing customer data over USB
    System.out.println("Legacy system is printing customer data for customer ID: " + customerId);
  }

  @Override
  public void getCustomer_USB(int customerId) {
    // Mock implementation of retrieving customer data over USB
    System.out.println("Legacy system is retrieving customer data for customer ID: " + customerId);
  }
}