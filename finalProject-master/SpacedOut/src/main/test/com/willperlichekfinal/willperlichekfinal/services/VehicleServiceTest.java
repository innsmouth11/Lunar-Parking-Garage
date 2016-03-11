/**
 * 
 */
package com.willperlichekfinal.willperlichekfinal.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.daos.VehicleDao;
import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;

/**
 * Class VehicleServiceTest
 * 
 * Mockito unit tests for functions in the class VehicleServiceTest
 * 
 * @author wperlichek
 *
 */
public class VehicleServiceTest {

	private VehicleServiceImpl service;
	private VehicleDao dao;

	/**
	 * setup()
	 * 
	 * setup VehicleService and Dao for test, mocking the dao layer
	 * 
	 * @author wperlichek
	 *
	 */
	@Before
	public void setup() {
		service = new VehicleServiceImpl();
		dao = mock(VehicleDao.class);
		service.setVehicleDao(dao);
	}

	/**
	 * getAllVehiclesTest()
	 * 
	 * test the getAllDevs function in the context of the DAO layer and the
	 * service layer
	 * 
	 * 
	 * @author wperlichek
	 *
	 */
	@Test
	public void getAllVehiclesTest() {
		List<Vehicle> vehicles = mock(List.class);
		when(dao.getAllVehicles()).thenReturn(vehicles);
		service.getAllVehicles();
		verify(dao).getAllVehicles();
	}

}
