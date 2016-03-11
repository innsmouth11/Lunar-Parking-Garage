package com.willperlichekfinal.willperlichekfinal.services;
import java.util.List;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;

/**
 * MonthlyPassService
 * 
 * MonthlyPass Service that acts as the middle between
 * the web service and the DAO layer, concerning MonthlyPass
 * entity
 * 
 * @author wperlichek
 *
 */
public interface MonthlyPassService {
	
	/**
	 * addMonthlyPass() - IMPL
	 * 
	 * Create a new MonthlyPass
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 *
	 */
	void addMonthlyPass(MonthlyPass monthlyPass);

	/**
	 * updateMonthlyPassById() - IMPL
	 * 
	 * Update an existing MonthlyPass by ID 
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 */
	public void updateMonthlyPassById(MonthlyPass monthlyPass);

	/**
	 * getMonthlyPassById() - IMPL
	 * 
	 * View a single MonthlyPass, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public MonthlyPass getMonthlyPassById(Integer id);

	/**
	 * deleteMonthlyPassById - IMPL
	 * 
	 * Delete a monthly pass by ID 
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	public void deleteMonthlyPassById(Integer id);

	/**
	 * getAllMonthlyPass() - IMPL
	 * 
	 * View all existing MonthlyPass 
	 * 
	 * @author wperlichek
	 * @param none
	 */
	public List<MonthlyPass> getAllMonthlyPass();

}
