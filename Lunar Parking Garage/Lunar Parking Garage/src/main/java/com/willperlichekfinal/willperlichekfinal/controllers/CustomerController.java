package com.willperlichekfinal.willperlichekfinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class CustomerController
 * 
 * Controller for all pages related to Customer entity
 * 
 * @author wperlichek
 * @param none
 */
@Controller
public class CustomerController {

	/* INDEX */
	@RequestMapping(value = "/customerindex", method = RequestMethod.GET)
	public String customerIndex() {
		return "customer-index.html";
	}

	/* UPDATE */
	@RequestMapping(value = "/customerupdate", method = RequestMethod.GET)
	public String customerUpdate() {
		return "customer-update.html";
	}

	/* CREATE */
	@RequestMapping(value = "/customercreate", method = RequestMethod.GET)
	public String customerCreate() {
		return "customer-create.html";
	}

}
