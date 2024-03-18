package edu.bu.met.cs665.example1;

/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: CustomerData_HTTPS.java
 * Description: This interface represents the target interface for customer data
 * retrieval over HTTPS.
 */

public interface CustomerDataHttps {
  void printCustomer(int customerId);

  void getCustomer_Https(int customerId);
}