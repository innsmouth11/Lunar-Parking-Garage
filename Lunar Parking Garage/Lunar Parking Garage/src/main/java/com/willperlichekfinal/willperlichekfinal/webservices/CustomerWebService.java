package com.willperlichekfinal.willperlichekfinal.webservices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.willperlichekfinal.willperlichekfinal.daos.CustomerDao;
import com.willperlichekfinal.willperlichekfinal.entities.Customer;
import com.willperlichekfinal.willperlichekfinal.hibernate.CustomerDaoHibernate;
import com.willperlichekfinal.willperlichekfinal.services.CustomerService;

/**
 * Class CustomerWebService
 * 
 ************** /customers
 * 
 * RestController for Customer Entity First Java point of contact for GET, POST,
 * and PUT requests
 * 
 * @author wperlichek
 *
 */
@RestController
public class CustomerWebService {

	@Autowired
	private CustomerService custService;
	/* connect to service layer */
	public void setCustomerService(CustomerService custService) {
		this.custService = custService;
	}

	/**
	 * CREATE ** addCustomer() - POST
	 * 
	 * Create a new Customer
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public void addCustomer(@RequestBody Customer customer) {
		custService.addCustomer(customer);
	}

	/**
	 * VIEW ** getCustomers() - GET
	 * 
	 * view all customers
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		return custService.getAllCustomers();
	}

	/**
	 * VIEW ** updateCustomer() - PUT
	 * 
	 * update an existing customer
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/customers", method = RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer customer) {
		custService.updateCustomerById(customer);
	}

}
