package com.willperlichekfinal.willperlichekfinal.services;

import java.util.List;

import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;

/**
 * VehicleService
 * 
 * The service layer for vehicle, which acts as a go-between for the WebService
 * and the DAO associated with entity Vehicle
 * 
 * @author wperlichek
 *
 */
public interface VehicleService {

	/**
	 * addVehicle() - IMPL
	 * 
	 * Create a new Vehicle
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 *
	 */
	void addVehicle(Vehicle vehicle);

	/**
	 * updateVehicleById() - IMPL
	 * 
	 * Update an existing Vehicle by ID
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 */
	public void updateVehicleById(Vehicle vehicle);

	/**
	 * getVehicleById() - IMPL
	 * 
	 * View a single Vehicle, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public Vehicle getVehicleById(Integer id);

	/**
	 * getAllVehicles() - IMPL
	 * 
	 * View all existing Vehicles
	 * 
	 * @author wperlichek
	 * @param none
	 */
	public List<Vehicle> getAllVehicles();

}
