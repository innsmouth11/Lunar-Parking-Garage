package com.willperlichekfinal.willperlichekfinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class HomeController
 * 
 * Controller home page of SpacedOut application
 * 
 * @author wperlichek
 * @param none
 *
 */
@Controller
public class HomeController {

	/* HOME */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String customerIndex() {
		return "homepage.html";
	}
	
	/* re-route to home if the user inputs an invalid path */
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String customerIndexCatch() {
		return "homepage.html";
	}


}
