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

import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;
import com.willperlichekfinal.willperlichekfinal.hibernate.MonthlyPassDaoHibernate;
import com.willperlichekfinal.willperlichekfinal.hibernate.MonthlyPassDaoHibernate;

import javassist.bytecode.Descriptor.Iterator;

/**
 * Class MonthlyPassDaoHibernateTest
 * 
 * Mockito unit tests for functions associated with class
 * MonthlyPassDaoHibernate
 * 
 * @author wperlichek
 *
 */
public class MonthlyPassDaoHibernateTest {

	private MonthlyPassDaoHibernate monthDao;
	private MonthlyPass month;
	private EntityManager mockEm;

	@Before
	public void setup() {
		monthDao = new MonthlyPassDaoHibernate();
		/* mock the Entity Manager used in DAO layer */
		mockEm = mock(EntityManager.class);
		/* set a new object with mocked EM */
		monthDao.setEm(mockEm);
		/* create a mock monthly pass class to work with */
		month = mock(MonthlyPass.class);
	}

	/**
	 * getAllMonthlyPasss()
	 * 
	 * Test the ability to get all monthly passes from the database
	 * 
	 * @author wperlichek
	 *
	 */
	@Test
	public void getAllMonthlyPassTest() {
		TypedQuery<MonthlyPass> query = mock(TypedQuery.class);
		Iterator iterator = mock(Iterator.class);
		/* create array to hold test results */
		List<MonthlyPass> monthlypass = new ArrayList<MonthlyPass>();
		monthlypass = Arrays.asList(month);
		when(mockEm.createQuery(anyString(), eq(MonthlyPass.class))).thenReturn(query);
		when(query.getResultList()).thenReturn(monthlypass);
		when(iterator.hasNext()).thenReturn(true, false);
		monthDao.getAllMonthlyPass();
	}

}
