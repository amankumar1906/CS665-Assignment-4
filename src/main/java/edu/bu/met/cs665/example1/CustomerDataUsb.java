package edu.bu.met.cs665.example1;

/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: CustomerData_USB.java
 * Description: This interface represents the adaptee interface for customer
 * data retrieval using USB.
 */
public interface CustomerDataUsb {
  void printCustomer_Usb(int customerId);

  void getCustomer_Usb(int customerId);
}