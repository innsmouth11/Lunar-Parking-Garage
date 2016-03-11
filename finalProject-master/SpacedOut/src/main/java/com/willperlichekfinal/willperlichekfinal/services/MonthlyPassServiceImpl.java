package com.willperlichekfinal.willperlichekfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willperlichekfinal.willperlichekfinal.daos.CustomerDao;
import com.willperlichekfinal.willperlichekfinal.daos.MonthlyPassDao;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;

/**
 * MonthlyPassServiceImpl
 * 
 * The logic for MonthlyPass Service, which serves as the 
 * middle between the WebService and the DAO for entity 
 * MonthlyPass
 * 
 * @author wperlichek
 *
 */
@Service
public class MonthlyPassServiceImpl implements MonthlyPassService {

	@Autowired
	private MonthlyPassDao monthlyPassDaoLayer;

	/* pass to the service later to the data access layer here */
	public void setMonthlyPassDao(MonthlyPassDao monthPassDao) {
		this.monthlyPassDaoLayer = monthPassDao;
	}

	/**
	 * addMonthlyPass() - IMPL
	 * 
	 * Create a new MonthlyPass
	 * 
	 * @author wperlichek
	 * @param MonthlyPass
	 *
	 */
	@Override
	public void addMonthlyPass(MonthlyPass monthlyPass) {
		monthlyPassDaoLayer.addMonthlyPass(monthlyPass);
	}

	/**
	 * getMonthlyPassById() - IMPL
	 * 
	 * View a single MonthlyPass, searching by ID
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public void updateMonthlyPassById(MonthlyPass monthlyPass) {
		monthlyPassDaoLayer.updateMonthlyPassById(monthlyPass);
	}


	/**
	 * deleteMonthlyPassById - IMPL
	 * 
	 * Delete a monthly pass by ID 
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public MonthlyPass getMonthlyPassById(Integer id) {
		return monthlyPassDaoLayer.getMonthlyPassById(id);
	}

	/**
	 * deleteMonthlyPassById
	 * 
	 * Delete a monthly pass by ID - IMPL
	 * 
	 * @author wperlichek
	 * @param Integer
	 */
	@Override
	public void deleteMonthlyPassById(Integer id) {
		monthlyPassDaoLayer.deleteMonthlyPassById(id);
	}

	/**
	 * getAllMonthlyPass() - IMPL
	 * 
	 * View all existing MonthlyPass 
	 * 
	 * @author wperlichek
	 * @param none
	 */
	@Override
	public List<MonthlyPass> getAllMonthlyPass() {
		return monthlyPassDaoLayer.getAllMonthlyPass();
	}

}
