/**
 * 
 */
package com.willperlichekfinal.willperlichekfinal.webservices;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.services.VehicleService;

/**
 * Class VehicleWebServiceTest
 * 
 * Mockito unit tests for the service layer of the application concerning
 * Vehicles
 * 
 * @author wperlichek
 *
 */
public class VehicleWebServiceTest {

	private VehicleService mockVehicleService;
	private VehicleWebService vehicleWebService;

	@Before
	public void createVehicleWebService() throws Exception {
		mockVehicleService = mock(VehicleService.class);
		vehicleWebService = new VehicleWebService();
		vehicleWebService.setVehicleService(mockVehicleService);
	}

	@Test
	public void testAddVehicle() throws Exception {
		vehicleWebService.addVehicle(null);
		verify(mockVehicleService, times(1)).addVehicle(null);
	}

	@Test
	public void testGetAllVehicles() throws Exception {
		vehicleWebService.getVehicles();
		verify(mockVehicleService, times(1)).getAllVehicles();
	}

	@Test
	public void testUpdateVehicle() throws Exception {
		vehicleWebService.updateVehicle(null);
		verify(mockVehicleService, times(1)).updateVehicleById(null);
	}

}
