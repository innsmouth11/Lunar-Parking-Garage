package com.willperlichekfinal.willperlichekfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class Customer
 * 
 * @author wperlichek
 * 
 *         This class contains the fields, setters, and getters that compose a
 *         Customer entity. The ID is mapped via the getter.
 */
@Entity
public class Customer {

	private int identificationnumber;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String emailaddress;

	/**
	 * @return the identificationnumber
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getidentificationnumber() {
		return identificationnumber;
	}

	/**
	 * @param identificationnumber
	 *            the identificationnumber to set
	 */
	public void setidentificationnumber(int identificationnumber) {
		this.identificationnumber = identificationnumber;
	}

	/**
	 * @return the first_name
	 */
	public String getfirstname() {
		return firstname;
	}

	/**
	 * @param first_name
	 *            the first_name to set
	 */
	public void setfirstname(String first_name) {
		this.firstname = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getlastname() {
		return lastname;
	}

	/**
	 * @param last_name
	 *            the last_name to set
	 */
	public void setlastname(String last_name) {
		this.lastname = last_name;
	}

	/**
	 * @return the phone_number
	 */
	public String getphonenumber() {
		return phonenumber;
	}

	/**
	 * @param phone_number
	 *            the phone_number to set
	 */
	public void setphonenumber(String phone_number) {
		this.phonenumber = phone_number;
	}

	/**
	 * @return the email_address
	 */
	public String getemailaddress() {
		return emailaddress;
	}

	/**
	 * @param email_address
	 *            the email_address to set
	 */
	public void setemailaddress(String email_address) {
		this.emailaddress = email_address;
	}

}
