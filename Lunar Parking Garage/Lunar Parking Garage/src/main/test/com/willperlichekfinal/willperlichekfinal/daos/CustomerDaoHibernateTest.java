package com.willperlichekfinal.willperlichekfinal.daos;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.entities.Customer;
import com.willperlichekfinal.willperlichekfinal.hibernate.CustomerDaoHibernate;

import javassist.bytecode.Descriptor.Iterator;

/**
 * Class CustomerDaoTest
 * 
 * Mockito unit tests for functions associated with class CustomerDaoHibernate
 * 
 * @author wperlichek
 *
 */
public class CustomerDaoHibernateTest {

	private CustomerDaoHibernate custDao;
	private Customer cust;
	private EntityManager mockEm;

	/**
	 * setup()
	 * 
	 * Setup entities for the Mockito tests
	 * 
	 * @author wperlichek
	 *
	 */
	@Before
	public void setup() {
		custDao = new CustomerDaoHibernate();
		/* mock the Entity Manager used in DAO layer */
		mockEm = mock(EntityManager.class);
		/* set a new object with mocked EM */
		custDao.setEm(mockEm);
		/* create a mock customer class to work with */
		cust = mock(Customer.class);
	}

	/**
	 * getAllCustomers()
	 * 
	 * Test the ability to get all customers from the database
	 * 
	 * @author wperlichek
	 *
	 */
	@Test
	public void getAllCustomersTest() {
		TypedQuery<Customer> query = mock(TypedQuery.class);
		Iterator iterator = mock(Iterator.class);
		/* create array to hold test results */
		List<Customer> customers = new ArrayList<Customer>();
		customers = Arrays.asList(cust);
		when(mockEm.createQuery(anyString(), eq(Customer.class))).thenReturn(query);
		when(query.getResultList()).thenReturn(customers);
		when(iterator.hasNext()).thenReturn(true, false);
		custDao.getAllCustomers();
	}

}
