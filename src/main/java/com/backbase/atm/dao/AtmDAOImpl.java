package com.backbase.atm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backbase.atm.model.Atm;
import com.backbase.atm.service.IntegrationService;


@Repository
public class AtmDAOImpl implements AtmDAO {
	
	@Autowired
	IntegrationService intService;

	/**
	 * retrieve the list all available atms from ING using Spring Integration
	 */
	@Override
	public List<Atm> getAllAtms() {
		List<Atm> atms = intService.getAllAtms();
		return atms;
	}

}
