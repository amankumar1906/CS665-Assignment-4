/**
 * Name: Aman Kumar
 * Course: CS-665 Software Design and Patterns
 * Date: 03/18/2024
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Client;
import edu.bu.met.cs665.example1.CustomerDataAdapter;
import edu.bu.met.cs665.example1.CustomerDataHttps;
import edu.bu.met.cs665.example1.CustomerDataUsb;
import edu.bu.met.cs665.example1.LegacyCustomerSystem;

/**
 * This is the Main class.
 */
public class Main {
  /**
   * The main entry point for the application.
   * <p>This method initializes the system by creating instances of the legacy system
   * and the adapter.
   * It then creates a client instance, passing the adapter as the customer
   * data access interface.
   * Finally, it demonstrates the use of the client to fetch and print customer data,
   * showing how the adapter
   * allows the client to interact with the legacy system using the new system's interface.</p>
   * @param args command line arguments (not used in this application).
   */
  public static void main(String[] args) {
    // Create an instance of the LegacyCustomerSystem
    CustomerDataUsb legacySystem = new LegacyCustomerSystem();

    // Create an adapter for the legacy system, so it can be used as CustomerData_HTTPS
    CustomerDataHttps customerDataHttps = new CustomerDataAdapter(legacySystem);

    // Create a client with the adapted interface
    Client client = new Client(customerDataHttps);

    // Use the client to fetch and print customer data
    int customerId = 123; // Example customer ID
    client.fetchAndPrintCustomerData(customerId);
  }
}
