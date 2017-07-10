package com.backbase.atm.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GeoLocationTest {
	
	
	GeoLocation location;
	
	@Before
	public void doBefore(){
		location = new GeoLocation();
		location.setLat("52.111805");
		location.setLng("4.287714");
	}
	

	/**
	 * 
	 */
	@Test
	public void setGeoLocationTest() {
		
		GeoLocation testLoc = new GeoLocation("52.111805", "4.287714");
		String expectedLat = testLoc.getLat();
		String expectedLng = testLoc.getLng();
		
		assertEquals("latitude was set", expectedLat, location.getLat());
		assertEquals("longitude was set", expectedLng, location.getLng());
	}
	
	@Test
	public void toStringTest(){
		
		assertTrue("contains lat", location.toString().contains("52.111805"));
	}

}
