package com.willperlichekfinal.willperlichekfinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class MonthlyPasssController
 * 
 * Controller for all pages related to MonthlyPassEntity
 * 
 * @author wperlichek
 * @param none
 */
@Controller
public class MonthlyPassController {

	/* INDEX */
	@RequestMapping(value = "/monthlypassindex", method = RequestMethod.GET)
	public String monthlypassIndex() {
		return "monthlypass-index.html";
	}

	/* UPDATE */
	@RequestMapping(value = "/monthlypassupdate", method = RequestMethod.GET)
	public String monthlypassUpdate() {
		return "monthlypass-update.html";
	}

	/* CREATE */
	@RequestMapping(value = "/monthlypasscreate", method = RequestMethod.GET)
	public String monthlypassCreate() {
		return "monthlypass-create.html";
	}

	/* DELETE */
	@RequestMapping(value = "/monthlypassdelete", method = RequestMethod.GET)
	public String monthlypassDelete() {
		return "monthlypass-delete.html";
	}

}
