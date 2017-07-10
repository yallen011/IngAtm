package com.backbase.atm.service;

import java.util.Collection;
import java.util.List;

import com.backbase.atm.model.Atm;


public interface AtmService {
	
	List<Atm> getAtmByCity(String city);

	Collection<Atm> getAtms();
	
	

}
