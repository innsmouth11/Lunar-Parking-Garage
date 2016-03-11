/**
 * 
 */
package com.willperlichekfinal.willperlichekfinal.services;

import java.util.List;

import com.willperlichekfinal.willperlichekfinal.entities.Customer;

/**
 * Interface CustomerService
 * 
 * The middle layer between the DAO and the WebService for the entity
 * Customer 
 * 
 * @author wperlichek
 *
 */
public interface CustomerService {

	/**
	 * addCustomer()
	 * 
	 * Service layer for creating a customer
	 * 
	 * @author wperlichek
	 * @param Customer
	 *
	 */
	void addCustomer(Customer customer);

	/**
	 * updateCustomerById()
	 * 
	 * Service layer for updating a customer by Id
	 * 
	 * @author wperlichek
	 * @param Customer
	 */
	public void updateCustomerById(Customer customer);

	/**
	 * getCustomerById()
	 * 
	 * Service layer for getting a customer by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public Customer getCustomerById(Integer id);

	/**
	 * getAllCustomers()
	 * 
	 * Service layer for getting all customers
	 * 
	 * @author wperlichek
	 * @param none
	 */
	public List<Customer> getAllCustomers();

}
