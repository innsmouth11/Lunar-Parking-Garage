package com.willperlichekfinal.willperlichekfinal.daos;

import java.util.ArrayList;
import java.util.List;

import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;

/**
 * Class VehicleDaoImpl
 * 
 * The logic for for the VehicleDao interface, concerned with entity Vehicle.
 * Creates, updates, and read Vehicles from the database.
 * 
 * @author wperlichek
 *
 */
public class VehicleDaoImpl implements VehicleDao {

	private List<Vehicle> vehicleList = new ArrayList<>();

	/**
	 * addVehicle()
	 * 
	 * Add a new vehicle to the database
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 *
	 */
	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}

	/**
	 * updateVehicleById()
	 * 
	 * Update an existing vehicle in the database by Id
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 */
	@Override
	public void updateVehicleById(Vehicle vehicle) {
		for (int i = 0; i < vehicleList.size(); i++) {
			/* search for id number and switch objects if it is found */
			if (vehicleList.get(i).getvidentificationnumber() == vehicle.getvidentificationnumber()) {
				vehicleList.set(i, vehicle);
				return;
			}
		}
	}

	/**
	 * getVehicleById()
	 * 
	 * View a single Vehicle, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public Vehicle getVehicleById(Integer custId) {
		for (int i = 0; i < vehicleList.size(); i++) {
			/* get object by id */
			if (vehicleList.get(i).getvidentificationnumber() == custId) {
				return vehicleList.get(i);
			}

		}
		return null;
	}

	/**
	 * getAllVehicles()
	 * 
	 * View all existing Vehicles
	 * 
	 * @author wperlichek
	 * @param none
	 */
	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicleList;
	}

}
