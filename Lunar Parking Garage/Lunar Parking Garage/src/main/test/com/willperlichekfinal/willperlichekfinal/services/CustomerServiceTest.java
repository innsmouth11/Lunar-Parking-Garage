
package com.willperlichekfinal.willperlichekfinal.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.willperlichekfinal.willperlichekfinal.daos.CustomerDao;
import com.willperlichekfinal.willperlichekfinal.entities.Customer;

/**
 * Class CustomerServiceTest
 * 
 * Mockito unit tests for functions in the class CustomerServiceTest
 * 
 * @author wperlichek
 *
 */
public class CustomerServiceTest {

	private CustomerServiceImpl service;
	private CustomerDao dao;

	/**
	 * setup()
	 * 
	 * setup CustomerService and Dao for test, mocking the dao layer
	 * 
	 * @author wperlichek
	 *
	 */
	@Before
	public void setup() {
		service = new CustomerServiceImpl();
		dao = mock(CustomerDao.class);
		service.setCustomerDao(dao);
	}

	/**
	 * getAllCustomersTest()
	 * 
	 * test the getAllCustomers function in the context of the DAO layer and the
	 * service layer
	 * 
	 * 
	 * @author wperlichek
	 *
	 */
	@Test
	public void getAllCustomersTest() {
		List<Customer> customers = mock(List.class);
		when(dao.getAllCustomers()).thenReturn(customers);
		service.getAllCustomers();
		verify(dao).getAllCustomers();
	}

}
