package com.willperlichekfinal.willperlichekfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.willperlichekfinal.willperlichekfinal.daos.CustomerDao;
import com.willperlichekfinal.willperlichekfinal.entities.Customer;

/**
 * CustomerServiceImpl
 * 
 * Pass controller from Service Layer to DAO layer (IMPL)
 * 
 * @author wperlichek
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/* create DAO object, which is next layer */
	@Autowired
	private CustomerDao newCustomerServiceDao;

	/* pass to the service later to the data access layer here */
	public void setCustomerDao(CustomerDao custDao) {
		this.newCustomerServiceDao = custDao;
	}

	/**
	 * addCustomer() IMPL
	 * 
	 * Service layer for creating a customer
	 * 
	 * @author wperlichek
	 * @param Customer
	 *
	 */
	public void addCustomer(Customer customer) {
		newCustomerServiceDao.addCustomer(customer);
	}

	/**
	 * updateCustomerById() IMPL
	 * 
	 * Service layer for updating a customer by Id
	 * 
	 * @author wperlichek
	 * @param Customer
	 */
	public void updateCustomerById(Customer customer) {
		newCustomerServiceDao.updateCustomerById(customer);
	}

	/**
	 * getCustomerById() IMPL
	 * 
	 * Service layer for getting a customer by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public Customer getCustomerById(Integer id) {
		return newCustomerServiceDao.getCustomerById(id);
	}

	/**
	 * getCustomerById() IMPL
	 * 
	 * Service layer for getting a customer by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public List<Customer> getAllCustomers() {
		List<Customer> customers = newCustomerServiceDao.getAllCustomers();
		return customers;
	}

}
