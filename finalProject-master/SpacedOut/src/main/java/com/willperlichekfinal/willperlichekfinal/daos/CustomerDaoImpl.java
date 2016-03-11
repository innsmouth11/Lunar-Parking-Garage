package com.willperlichekfinal.willperlichekfinal.daos;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.willperlichekfinal.willperlichekfinal.entities.Customer;

/**
 * Class CustomerDaoImpl
 * 
 * The implementation of the interface CustomerDao. CustomerDaoImpl
 * contains the logic for reading, updating, and creating Customers
 * in the database
 * 
 * @author wperlichek
 * @param none
 */
public class CustomerDaoImpl implements CustomerDao {

	private List<Customer> customerList = new ArrayList<>();

	/**
	 * addCustomer()
	 * 
	 * Add a new customer to the database
	 * 
	 * @author wperlichek
	 * @param Customer
	 *
	 */
	@Override
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	/**
	 * updateCustomerById()
	 * 
	 * Update an existing customer in the database
	 * 
	 * @author wperlichek
	 * @param Customer
	 */
	@Override
	public void updateCustomerById(Customer customer) {
		for (int i = 0; i < customerList.size(); i++) {
			/* search for id number and switch objects if it is found */
			if (customerList.get(i).getidentificationnumber() == customer.getidentificationnumber()) {
				customerList.set(i, customer);
				return;
			}
		}
	}

	/**
	 * getCustomerById()
	 * 
	 * Retrieve a specific customer from the database, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public Customer getCustomerById(Integer custId) {
		for (int i = 0; i < customerList.size(); i++) {
			/* get object by id */
			if (customerList.get(i).getidentificationnumber() == custId) {
				return customerList.get(i);
			}

		}
		return null;
	}

	/**
	 * getAllCustomers()
	 * 
	 * View all existing customers in the database
	 * 
	 * @author wperlichek
	 * @param none
	 */
	@Override
	public List<Customer> getAllCustomers() {
		return customerList;
	}

}
