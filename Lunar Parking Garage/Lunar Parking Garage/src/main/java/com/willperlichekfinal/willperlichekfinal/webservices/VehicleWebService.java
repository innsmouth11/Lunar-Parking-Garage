package com.willperlichekfinal.willperlichekfinal.webservices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;
import com.willperlichekfinal.willperlichekfinal.services.VehicleService;

/**
 * Class VehicleWebService
 * 
 ************ /vehicles
 * 
 * RestController for Vehicle Entity First Java point of contact for GET, POST,
 * and PUT requests
 * 
 * @author wperlichek
 *
 */
@RestController
public class VehicleWebService {

	@Autowired
	private VehicleService vehicleService;
	/* connect to Service layer */
	public void setVehicleService(VehicleService vehService) {
		this.vehicleService = vehService;
	}

	/**
	 * CREATE ** addVehicle() - POST
	 * 
	 * Create a new Vehicle
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/vehicles", method = RequestMethod.POST)
	public void addVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.addVehicle(vehicle);
	}

	/**
	 * VIEW ** getVehicle() - GET
	 * 
	 * view all vehicles
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/vehicles", method = RequestMethod.GET)
	public List<Vehicle> getVehicles() {
		return vehicleService.getAllVehicles();
	}

	/**
	 * UPDATE ** upCustomer() - PUT
	 * 
	 * update an existing vehicle
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/vehicles", method = RequestMethod.PUT)
	public void updateVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.updateVehicleById(vehicle);
	}

}
