package com.willperlichekfinal.willperlichekfinal.daos;

import java.util.List;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;

/**
 * Interface MonthlyPassDao
 * 
 * The interface for the data access layer of the application, concerning entity
 * MonthlyPassDao
 * 
 * @author wperlichek
 * @param none
 */
public interface MonthlyPassDao {

	/**
	 * addMonthlyPass()
	 * 
	 * Add a new monthly pass to the database
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 *
	 */
	void addMonthlyPass(MonthlyPass monthlyPass);

	/**
	 * updateMonthlyPass()
	 * 
	 * Update an existing MonthlyPass in the database
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 */
	public void updateMonthlyPassById(MonthlyPass monthlyPass);

	/**
	 * getMonthlyPassById()
	 * 
	 * View a single MonthlyPass, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public MonthlyPass getMonthlyPassById(Integer id);

	/**
	 * deleteMonthlyPassById
	 * 
	 * Delete a monthly pass from the database by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public void deleteMonthlyPassById(Integer id);

	/**
	 * getAllMonthlyPass()
	 * 
	 * View all existing MonthlyPasses
	 * 
	 * @author wperlichek
	 * @param none
	 */
	public List<MonthlyPass> getAllMonthlyPass();

}
