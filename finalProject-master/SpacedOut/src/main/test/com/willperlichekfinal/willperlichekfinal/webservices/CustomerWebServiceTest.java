/**
 * 
 */
package com.willperlichekfinal.willperlichekfinal.webservices;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.services.CustomerService;

/**
 * Class CustomerWebServiceTest
 * 
 * Mockito unit tests for the service layer of the application concerning
 * Customers
 * 
 * @author wperlichek
 *
 */
public class CustomerWebServiceTest {

	private CustomerService mockCustomerService;
	private CustomerWebService customerWebService;

	@Before
	public void createCustomerWebService() throws Exception {
		mockCustomerService = mock(CustomerService.class);
		customerWebService = new CustomerWebService();
		customerWebService.setCustomerService(mockCustomerService);
	}

	@Test
	public void testAddCustomer() throws Exception {
		customerWebService.addCustomer(null);
		verify(mockCustomerService, times(1)).addCustomer(null);
	}

	@Test
	public void testGetAllCustomers() throws Exception {
		customerWebService.getCustomers();
		verify(mockCustomerService, times(1)).getAllCustomers();
	}

	@Test
	public void testUpdateCustomer() throws Exception {
		customerWebService.updateCustomer(null);
		verify(mockCustomerService, times(1)).updateCustomerById(null);
	}

}
