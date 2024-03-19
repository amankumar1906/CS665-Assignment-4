package edu.bu.met.cs665.example1;

/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: Client.java
 * Description: This class represents the client that interacts with the Target interface.
 */
public class Client {
  private final CustomerDataHttps customerDataHttps;

  /**
   * Constructor for Client.
   *
   * @param customerDataHttps the target interface that the client will use
   */
  public Client(CustomerDataHttps customerDataHttps) {
    this.customerDataHttps = customerDataHttps;
  }

  /**
   * Method to demonstrate interaction with the CustomerData_HTTPS interface.
   *
   * @param customerId the ID of the customer to print and get data for
   */
  public void fetchAndPrintCustomerData(int customerId) {
    customerDataHttps.printCustomer(customerId);
    customerDataHttps.getCustomer_Https(  customerId);
  }
}