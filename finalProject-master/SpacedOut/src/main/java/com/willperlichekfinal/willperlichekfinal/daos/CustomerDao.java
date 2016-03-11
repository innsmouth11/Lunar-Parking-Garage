package com.willperlichekfinal.willperlichekfinal.daos;

import java.util.List;

import com.willperlichekfinal.willperlichekfinal.entities.Customer;

/**
 * Interface CustomerDao
 * 
 * The interface for the data access layer of the application, concerning entity
 * Customer
 * 
 * @author wperlichek
 * @param none
 */
public interface CustomerDao {

	/**
	 * addCustomer()
	 * 
	 * Add a new customer to the database
	 * 
	 * @author wperlichek
	 * @param Customer
	 *
	 */
	void addCustomer(Customer customer);

	/**
	 * updateCustomerById()
	 * 
	 * Update an existing customer in the database
	 * 
	 * @author wperlichek
	 * @param Customer
	 */
	public void updateCustomerById(Customer customer);

	/**
	 * getCustomerById()
	 * 
	 * Retrieve a specific customer from the database, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public Customer getCustomerById(Integer id);

	/**
	 * getAllCustomers()
	 * 
	 * View all existing customers in the database
	 * 
	 * @author wperlichek
	 * @param none
	 */
	public List<Customer> getAllCustomers();

}
