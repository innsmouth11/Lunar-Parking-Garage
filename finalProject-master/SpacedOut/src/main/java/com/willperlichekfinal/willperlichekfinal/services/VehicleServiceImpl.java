package com.willperlichekfinal.willperlichekfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.willperlichekfinal.willperlichekfinal.daos.VehicleDao;
import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;

/**
 * VehicleServiceImpl
 * 
 * The logic for the service layer of VehicleService, which connects the DAO
 * with the WebService of Vehicle
 * 
 * @author wperlichek
 *
 */
@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao vehicleDaoLayer;

	/* connect to DAO layer */
	public void setVehicleDao(VehicleDao vehicleDao) {
		this.vehicleDaoLayer = vehicleDao;
	}

	/**
	 * addVehicle() - IMPL
	 * 
	 * Create a new Vehicle
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 *
	 */
	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicleDaoLayer.addVehicle(vehicle);
	}

	/**
	 * updateVehicleById() - IMPL
	 * 
	 * Update an existing Vehicle by ID
	 * 
	 * @author wperlichek
	 * @param Vehicle
	 */
	@Override
	public void updateVehicleById(Vehicle vehicle) {
		vehicleDaoLayer.updateVehicleById(vehicle);
	}

	/**
	 * getVehicleById() - IMPL
	 * 
	 * View a single Vehicle, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public Vehicle getVehicleById(Integer id) {
		return vehicleDaoLayer.getVehicleById(id);
	}

	/**
	 * getAllVehicles() - IMPL
	 * 
	 * View all existing Vehicles
	 * 
	 * @author wperlichek
	 * @param none
	 */
	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicleDaoLayer.getAllVehicles();
	}

}
