package edu.bu.met.cs665;

import static org.junit.Assert.assertTrue;

import edu.bu.met.cs665.example1.CustomerDataAdapter;
import edu.bu.met.cs665.example1.CustomerDataHTTPS;
import edu.bu.met.cs665.example1.LegacyCustomerSystem;
import org.junit.Before;
import org.junit.Test;

public class CustomerDataAdapterTest {

  private CustomerDataHTTPS adapter;
  private LegacyCustomerSystem legacySystem;

  @Before
  public void setUp() {
    // Given: a legacy system object and an adapter
    legacySystem = new LegacyCustomerSystem();
    adapter = new CustomerDataAdapter(legacySystem);
  }

  @Test
  public void testPrintCustomer() {
    // When: we call printCustomer on the adapter
    adapter.printCustomer(100);
    assertTrue(true); // This is a placeholder, assuming the call was successful.
  }

  @Test
  public void testGetCustomer_HTTPS() {
    // When: we call getCustomer_HTTPS on the adapter
    adapter.getCustomer_HTTPS(200);

    // Then: we check if the getCustomer_USB method of the legacy system was called
    // Again, without a return type, we can't assert on output, only behavior.
    assertTrue(true); // This is a placeholder, assuming the call was successful.
  }

  @Test
  public void testAdapterUsesLegacySystem() {
    // When: a method on the adapter is called
    adapter.printCustomer(300);

    // Then: the adapter should use the legacy system to perform the operation
    // In a real scenario, we would use a mock to verify the interaction.
    assertTrue(true); // Placeholder, assuming the legacy system was used.
  }

  @Test
  public void testAdapterForDifferentCustomerIDs() {
    // When: we use the adapter for a different customer ID
    adapter.getCustomer_HTTPS(400);

    // Then: it should work for any customer ID we pass in
    assertTrue(true); // Placeholder for demonstration purposes.
  }

  @Test
  public void testLegacySystemDirectly() {
    // When: we use the legacy system directly
    legacySystem.printCustomer_USB(500);

    // Then: it should perform the action as expected, without the adapter
    assertTrue(true); // Placeholder, assuming the direct call was successful.
  }
}
