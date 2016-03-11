package com.willperlichekfinal.willperlichekfinal.webservices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.willperlichekfinal.willperlichekfinal.daos.MonthlyPassDao;
import com.willperlichekfinal.willperlichekfinal.entities.MonthlyPass;
import com.willperlichekfinal.willperlichekfinal.services.MonthlyPassService;

/**
 * Class MonthlyPassWebService
 * 
 ************** /monthlypasses
 * 
 * RestController for MonthlyPass Entity First Java point of contact for GET,
 * POST, PUT, DELETE web requests
 * 
 * @author wperlichek
 *
 */
@RestController
public class MonthlyPassWebService {

	@Autowired
	private MonthlyPassService monthPathService;
	/* connect to service layer */
	public void setMonthlyPassService(MonthlyPassService monthPathService) {
		this.monthPathService = monthPathService;
	}

	/**
	 * CREATE ** addMonthlyPass() - POST
	 * 
	 * Create a new MonthlyPass
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/monthlypasses", method = RequestMethod.POST)
	public void addMonthlyPass(@RequestBody MonthlyPass monthlyPass) {
		monthPathService.addMonthlyPass(monthlyPass);
	}

	/**
	 * VIEW ** getMonthlyPass() - GET
	 * 
	 * view all monthlyPass
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/monthlypasses", method = RequestMethod.GET)
	public List<MonthlyPass> getMonthlyPass() {
		return monthPathService.getAllMonthlyPass();
	}

	/**
	 * UPDATE ** updateMonthlyPass() - PUT
	 * 
	 * update an existing monthlypass
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/monthlypasses", method = RequestMethod.PUT)
	public void updateMonthlyPass(@RequestBody MonthlyPass monthlyPass) {
		monthPathService.updateMonthlyPassById(monthlyPass);
	}

	/**
	 * DELETE** deleteMonthlyPass() - DELETE
	 * 
	 * Delete an existing monthly pass
	 * 
	 * @author wperlichek
	 */
	@RequestMapping(value = "/monthlypasses/{id}", method = RequestMethod.DELETE)
	public void removeEmployee(@PathVariable Integer id) {
		monthPathService.deleteMonthlyPassById(id);
	}

}
