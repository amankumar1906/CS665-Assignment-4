/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Client;
import edu.bu.met.cs665.example1.CustomerDataHTTPS;
import edu.bu.met.cs665.example1.CustomerDataUSB;
import edu.bu.met.cs665.example1.LegacyCustomerSystem;
import edu.bu.met.cs665.example1.CustomerDataAdapter;

/**
 * This is the Main class.
 */
public class Main {

  public static void main(String[] args) {
    // Create an instance of the LegacyCustomerSystem
    CustomerDataUSB legacySystem = new LegacyCustomerSystem();

    // Create an adapter for the legacy system, so it can be used as CustomerData_HTTPS
    CustomerDataHTTPS customerDataHttps = new CustomerDataAdapter(legacySystem);

    // Create a client with the adapted interface
    Client client = new Client(customerDataHttps);

    // Use the client to fetch and print customer data
    int customerId = 123; // Example customer ID
    client.fetchAndPrintCustomerData(customerId);
  }
}
