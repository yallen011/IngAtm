/**
 * 
 */
package com.backbase.atm.service;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backbase.atm.dao.AtmDAO;
import com.backbase.atm.model.Atm;

/**
 * @author Yvonne
 *
 */

@Service
public class AtmServiceImpl implements AtmService {

	@Autowired
	AtmDAO atmDao;
	/**
	 *  Return a list of atms by city
	 * @param city city to search for available atms 
	 */
	@Override
	public List<Atm> getAtmByCity(String requestedCity) {
		Collection<Atm> atms = getAtms();
		
		List<Atm>atmsByCity = new LinkedList<>();
		
		//capitalize the first letter of the city to make it case-insensitive
		requestedCity = requestedCity.substring(0, 1).toUpperCase() + requestedCity.substring(1);
		
		//retrieve atms by city
		for(Atm atm: atms){
			String city = atm.getAddress().getCity();
			if(city.equals(requestedCity)){
				atmsByCity.add(atm);
			}
		}
		
		return atmsByCity;
	}
	
	/**
	 * retrive all atms from ING webservice
	 * 
	 */
	@Override
	public Collection<Atm> getAtms() {
		Collection<Atm> atms = atmDao.getAllAtms();
		return atms;
	}

}
