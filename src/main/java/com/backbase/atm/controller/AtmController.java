package com.backbase.atm.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backbase.atm.model.Atm;
import com.backbase.atm.service.AtmService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600 )
@RestController
public class AtmController {

	AtmService service;
	
	
	@Autowired
	public AtmController( AtmService service){
		this.service = service;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/")
	Collection<Atm> getAtms(){
		
		return service.getAtms();
	}

	@RequestMapping(value ="/atms", method=RequestMethod.GET)
	Collection<Atm> getAtmsByCity(@RequestParam("city") String city){


		return service.getAtmByCity(city);
		
	}	

}
