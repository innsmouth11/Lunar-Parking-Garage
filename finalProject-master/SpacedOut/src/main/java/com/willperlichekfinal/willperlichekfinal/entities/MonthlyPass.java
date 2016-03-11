package com.willperlichekfinal.willperlichekfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Class MonthlyPass
 * 
 * @author wperlichek
 *
 *         This class contains the fields, setters, and getters that compose a
 *         MonthlyPass entity. The ID is mapped via the getter for MonthlyPass.
 *         Customer and Vehicle are annotated in a ManyToOne relationship
 */
@Entity
public class MonthlyPass {

	/* Innate fields */
	private double price;
	private String expirationdate;
	private int monthlypassid;

	/* Foreign fields */
	private Customer customer;
	private Vehicle vehicle;

	/**
	 * @return the price
	 */
	public double getprice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setprice(double price) {
		this.price = price;
	}

	/**
	 * @return the expirationdate
	 */
	public String getexpirationdate() {
		return expirationdate;
	}

	/**
	 * @param expirationdate
	 *            the expirationdate to set
	 */
	public void setexpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}

	/**
	 * @return the monthly_pass_id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getmonthlypassid() {
		return monthlypassid;
	}

	/**
	 * @param monthly_pass_id
	 *            the monthly_pass_id to set
	 */
	public void setmonthlypassid(int monthly_pass_id) {
		this.monthlypassid = monthly_pass_id;
	}

	/**
	 * @return the customer
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name = "customer")
	public Customer getcustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setcustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the vehicle
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name = "vehicle")
	public Vehicle getvehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public void setvehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
