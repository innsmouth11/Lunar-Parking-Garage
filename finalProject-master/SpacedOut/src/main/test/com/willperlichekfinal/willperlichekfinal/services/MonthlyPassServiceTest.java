package com.willperlichekfinal.willperlichekfinal.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.willperlichekfinal.willperlichekfinal.daos.MonthlyPassDao;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;

/**
 * Class MonthlyPassServiceTest
 * 
 * Mockito unit tests for functions in the class MonthlyPassServiceTest
 * 
 * @author wperlichek
 *
 */
public class MonthlyPassServiceTest {

	private MonthlyPassServiceImpl service;
	private MonthlyPassDao dao;

	/**
	 * setup()
	 * 
	 * setup MonthlyPassService and Dao for test, mocking the dao layer
	 * 
	 * @author wperlichek
	 *
	 */
	@Before
	public void setup() {
		service = new MonthlyPassServiceImpl();
		dao = mock(MonthlyPassDao.class);
		service.setMonthlyPassDao(dao);
	}

	/**
	 * getAllMonthlyPasssTest()
	 * 
	 * test the getAllMonthlyPasss function in the context of the DAO layer and the
	 * service layer
	 * 
	 * 
	 * @author wperlichek
	 *
	 */
	@Test
	public void getAllMonthlyPassTest() {
		List<MonthlyPass> monthlypass = mock(List.class);
		when(dao.getAllMonthlyPass()).thenReturn(monthlypass);
		service.getAllMonthlyPass();
		verify(dao).getAllMonthlyPass();
	}

}
