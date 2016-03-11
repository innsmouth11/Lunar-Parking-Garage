package com.willperlichekfinal.willperlichekfinal.hibernate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

import com.willperlichekfinal.willperlichekfinal.daos.CustomerDao;
import com.willperlichekfinal.willperlichekfinal.entities.Customer;

/**
 * CustomerDaoHibernate
 * 
 * Connects to database and persists Customer class create, read, and update
 * 
 * @author wperlichek
 *
 */
@Component
@Transactional
public class CustomerDaoHibernate implements CustomerDao {

	/*
	 * Define EntityManager and set it to Customer class to connect to the
	 * database
	 */
	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/* CREATE */
	public void addCustomer(Customer customer) {
		em.persist(customer);
	};

	/* UPDATE */
	public void updateCustomerById(Customer customer) {
		em.merge(customer);
	};

	/* READ */
	public Customer getCustomerById(Integer identificationnumber) {
		return em.createQuery("SELECT e FROM Customer e WHERE e.identificationnumber = :id", Customer.class)
				.setParameter("id", identificationnumber).getSingleResult();
	};

	/* READ */
	public List<Customer> getAllCustomers() {
		return em.createQuery("SELECT e FROM Customer e", Customer.class).getResultList();
	}
}
