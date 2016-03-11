package com.willperlichekfinal.willperlichekfinal.daos;

import java.util.List;

import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;

/**
 * Interface VehicleDao
 * 
 * The interface for the data access layer of the application, concerning entity
 * VehicleDao
 * 
 * @author wperlichek
 *
 */
public interface VehicleDao {

	/**
	 * addVehicle()
	 * 
	 * Add a new vehicle to the database
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 *
	 */
	void addVehicle(Vehicle vehicle);

	/**
	 * updateVehicleById()
	 * 
	 * Update an existing vehicle in the database by Id
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 */
	public void updateVehicleById(Vehicle vehicle);

	/**
	 * getVehicleById()
	 * 
	 * View a single Vehicle, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public Vehicle getVehicleById(Integer id);

	/**
	 * getAllVehicles()
	 * 
	 * View all existing Vehicles
	 * 
	 * @author wperlichek
	 * @param none
	 */
	public List<Vehicle> getAllVehicles();

}
