package com.willperlichekfinal.willperlichekfinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class Vehicle
 * 
 * @author wperlichek
 * 
 *         This class contains the fields, setters, and getters that compose a
 *         Vehicle entity. The ID is mapped via the getter.
 */
@Entity
public class Vehicle {

	private int videntificationnumber;
	private String make;
	private String model;
	private String licenseplatenumber;
	private String location;
	private String color;

	/**
	 * @return the vIdentificationnumber
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getvidentificationnumber() {
		return videntificationnumber;
	}

	/**
	 * @param vehicle_identificationnumber
	 *            the vehicle_identificationnumber to set
	 */
	public void setvidentificationnumber(int vehicle_identificationnumberIN) {
		this.videntificationnumber = vehicle_identificationnumberIN;
	}

	/**
	 * @return the make
	 */
	public String getmake() {
		return make;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setmake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getmodel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setmodel(String model) {
		this.model = model;
	}

	/**
	 */
	public String getlicenseplatenumber() {
		return licenseplatenumber;
	}

	/**
	 * @param license_plate_number
	 *            the license_plate_number to set
	 */
	public void setlicenseplatenumber(String license_plate_number) {
		this.licenseplatenumber = license_plate_number;
	}

	/**
	 * @return the location
	 */
	public String getlocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setlocation(String location) {
		this.location = location;
	}

	/**
	 * @return the color
	 */
	public String getcolor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setcolor(String color) {
		this.color = color;
	}

}
