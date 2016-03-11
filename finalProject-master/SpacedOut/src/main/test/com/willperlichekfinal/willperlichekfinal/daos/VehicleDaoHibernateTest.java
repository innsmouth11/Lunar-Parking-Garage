
package com.willperlichekfinal.willperlichekfinal.daos;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.entities.Vehicle;
import com.willperlichekfinal.willperlichekfinal.hibernate.VehicleDaoHibernate;

import javassist.bytecode.Descriptor.Iterator;

/**
 * Class VehicleDaoTest
 * 
 * Mockito unit tests for functions associated with class VehicleDaoHibernate
 * 
 * @author wperlichek
 *
 */
public class VehicleDaoHibernateTest {

	private VehicleDaoHibernate custDao;
	private Vehicle cust;
	private EntityManager mockEm;

	/**
	 * setup()
	 * 
	 * Setup entities for the Mockito tests
	 * 
	 * @author wperlichek
	 *
	 */
	@Before
	public void setup() {
		custDao = new VehicleDaoHibernate();
		/* mock the Entity Manager used in DAO layer */
		mockEm = mock(EntityManager.class);
		/* set a new object with mocked EM */
		custDao.setEm(mockEm);
		/* create a mock vehicle class to work with */
		cust = mock(Vehicle.class);
	}

	/**
	 * getAllVehicles()
	 * 
	 * Test the ability to get all vehicles from the database
	 * 
	 * @author wperlichek
	 *
	 */
	@Test
	public void getAllVehiclesTest() {
		TypedQuery<Vehicle> query = mock(TypedQuery.class);
		Iterator iterator = mock(Iterator.class);
		/* create array to hold test results */
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles = Arrays.asList(cust);
		when(mockEm.createQuery(anyString(), eq(Vehicle.class))).thenReturn(query);
		when(query.getResultList()).thenReturn(vehicles);
		when(iterator.hasNext()).thenReturn(true, false);
		custDao.getAllVehicles();
	}

}
