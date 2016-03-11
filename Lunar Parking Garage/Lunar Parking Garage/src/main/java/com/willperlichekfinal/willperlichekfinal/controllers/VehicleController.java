package com.willperlichekfinal.willperlichekfinal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class VehicleController
 * 
 * Controller for all pages related to Vehicle entity
 * 
 * @author wperlichek
 * @param none
 */
@Controller
public class VehicleController {

	/* INDEX */
	@RequestMapping(value = "/vehicleindex", method = RequestMethod.GET)
	public String vehicleIndex() {
		return "vehicle-index.html";
	}

	/* UPDATE */
	@RequestMapping(value = "/vehicleupdate", method = RequestMethod.GET)
	public String vehicleUpdate() {
		return "vehicle-update.html";
	}

	/* CREATE */
	@RequestMapping(value = "/vehiclecreate", method = RequestMethod.GET)
	public String vehicleCreate() {
		return "vehicle-create.html";
	}

}
