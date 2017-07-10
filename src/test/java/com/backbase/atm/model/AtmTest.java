package com.backbase.atm.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AtmTest {

	Atm atm;
	
	@Before
	public void doBefore(){
		atm = new Atm();
		GeoLocation location = new GeoLocation("52.0970886", "5.1133961");
		atm.setAddress(new Address("Dunwoody Pl", "223", "30341", "Dunwoody",
				location));
	}
	
	@Test
	public void setAtmTest() {
		
		GeoLocation location = new GeoLocation("52.0970886", "5.1133961");
		Address address = new Address("Dunwoody Pl", "223", "30341", "Dunwoody", location);
		
		Atm testAtm = new Atm(address);
		
		
		
		assertEquals("Address was set", testAtm.getAddress(), atm.getAddress());
		assertEquals("Geo Location was set", testAtm.getAddress().getGeoLocation(), atm.getAddress().getGeoLocation());
		
		
	}
	
	@Test
	public void toStringTest(){
		
		assertTrue("contains postal code", atm.toString().contains("30341"));
	}

}
