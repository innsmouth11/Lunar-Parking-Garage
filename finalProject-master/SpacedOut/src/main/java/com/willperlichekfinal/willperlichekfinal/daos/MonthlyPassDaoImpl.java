package com.willperlichekfinal.willperlichekfinal.daos;

import java.util.ArrayList;
import java.util.List;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;

/**
 * Class MonthlyPassDaoImpl
 * 
 * The implementation of the interface MonthlyPassDao. MonthlyPassDaoImpl
 * contains the logic for reading, updating, and creating MonthlyPasses in the
 * database
 * 
 * @author wperlichek
 * @param none
 */
public class MonthlyPassDaoImpl implements MonthlyPassDao {

	/* monthlyPassList temporarily stores all monthly pass information */
	private List<MonthlyPass> monthlyPassList = new ArrayList<>();

	/**
	 * addMonthlyPass()
	 * 
	 * The logic for adding a new monthly pass to the database
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 *
	 */
	@Override
	public void addMonthlyPass(MonthlyPass monthlyPass) {
		monthlyPassList.add(monthlyPass);
	}

	/**
	 * updateMonthlyPassById()
	 * 
	 * The logic for updating a monthly pass by ID in the database
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 */
	@Override
	public void updateMonthlyPassById(MonthlyPass monthlyPass) {
		for (int i = 0; i < monthlyPassList.size(); i++) {
			/* search for id number and switch objects if it is found */
			if (monthlyPassList.get(i).getmonthlypassid() == monthlyPass.getmonthlypassid()) {
				monthlyPassList.set(i, monthlyPass);
				return;
			}
		}
	}

	/**
	 * getMonthlyPassById()
	 * 
	 * The logic for viewing a single monthly pass in the database by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public MonthlyPass getMonthlyPassById(Integer custId) {
		for (int i = 0; i < monthlyPassList.size(); i++) {
			/* get object by id */
			if (monthlyPassList.get(i).getmonthlypassid() == custId) {
				return monthlyPassList.get(i);
			}

		}
		return null;
	}

	/**
	 * getAllMonthlyPasss()
	 * 
	 * Get all monthly passes from the database (SQL query)
	 * 
	 * @author wperlichek
	 * @param none
	 */
	@Override
	public List<MonthlyPass> getAllMonthlyPass() {
		return monthlyPassList;
	}

	/**
	 * deleteMonthlyPassById()
	 * 
	 * Delete a monthly pass from the database by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public void deleteMonthlyPassById(Integer id) {
		for (int i = 0; i < monthlyPassList.size(); i++) {
			if (monthlyPassList.get(i).getmonthlypassid() == id) {
				monthlyPassList.remove(i);
			}
		}

	}

}
