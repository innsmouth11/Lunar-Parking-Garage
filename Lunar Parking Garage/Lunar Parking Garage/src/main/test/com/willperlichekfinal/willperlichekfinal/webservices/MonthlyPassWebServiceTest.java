package com.willperlichekfinal.willperlichekfinal.webservices;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.services.MonthlyPassService;

/**
 * Class MonthlyPassWebServiceTest
 * 
 * Mockito unit tests for the service layer of the application concerning
 * MonthlyPasses
 * 
 * @author wperlichek
 *
 */
public class MonthlyPassWebServiceTest {

	private MonthlyPassService mockMonthlyPassService;
	private MonthlyPassWebService monthlyPassWebService;

	@Before
	public void createMonthlyPassWebService() throws Exception {
		mockMonthlyPassService = mock(MonthlyPassService.class);
		monthlyPassWebService = new MonthlyPassWebService();
		monthlyPassWebService.setMonthlyPassService(mockMonthlyPassService);
	}

	@Test
	public void testAddMonthlyPass() throws Exception {
		monthlyPassWebService.addMonthlyPass(null);
		verify(mockMonthlyPassService, times(1)).addMonthlyPass(null);
	}

	@Test
	public void testGetAllMonthlyPass() throws Exception {
		monthlyPassWebService.getMonthlyPass();
		verify(mockMonthlyPassService, times(1)).getAllMonthlyPass();
	}

	@Test
	public void testUpdateMonthlyPass() throws Exception {
		monthlyPassWebService.updateMonthlyPass(null);
		verify(mockMonthlyPassService, times(1)).updateMonthlyPassById(null);
	}

	@Test
	public void testDeleteMonthlyPassById() throws Exception {
		monthlyPassWebService.removeEmployee(null);
		verify(mockMonthlyPassService, times(1)).deleteMonthlyPassById(null);
	}

}
