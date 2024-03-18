package edu.bu.met.cs665.example1;

/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: CustomerDataAdapter.java
 * Description: This class acts as an adapter to allow the new HTTPS system
 * to use the old USB system's methods.
 */
public class CustomerDataAdapter implements CustomerDataHttps {
  private final CustomerDataUsb customerDataUsb;

  /**
   * Constructor for CustomerDataAdapter.
   *
   * @param customerDataUsb the legacy USB system to adapt
   */
  public CustomerDataAdapter(CustomerDataUsb customerDataUsb) {
    this.customerDataUsb = customerDataUsb;
  }

  @Override
  public void printCustomer(int customerId) {
    // Adapter method to print customer data using the USB system
    customerDataUsb.printCustomer_Usb(customerId);
  }

  @Override
  public void getCustomer_Https(int customerId) {
    // Adapter method to get customer data using the USB system
    customerDataUsb.getCustomer_Usb(customerId);
  }
}