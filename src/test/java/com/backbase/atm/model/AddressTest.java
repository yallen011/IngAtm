package com.backbase.atm.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AddressTest {
	
	
	Address address;
	
	@Before
	public void doBefore(){
		address = new Address();
		address.setStreet("Park City");
		address.setHousenumber("12");
		address.setPostalcode("30022");
		address.setCity("Alpharetta");
		
	}
	

	/**
	 * 
	 */
	@Test
	public void setAddressTest() {
		
		Address testAddress = new Address("Park City", "12", "30022", "Alpharetta",
				new GeoLocation("52.0970886", "5.1133961"));
		String expectedStreet = testAddress.getStreet();
		String expectedHouseNumber = testAddress.getHousenumber();
		String expectedPostalCode = testAddress.getPostalcode();
		String expectedCity = testAddress.getCity();
		
		assertEquals("Street was set", expectedStreet, address.getStreet());
		assertEquals("House number was set", expectedHouseNumber, address.getHousenumber());
		assertEquals("Postal code was set", expectedPostalCode, address.getPostalcode());
		assertEquals("City was set", expectedCity, address.getCity());
	}
	
	@Test
	public void toStringTest(){
		
		assertTrue("contains street", address.toString().contains("Park City"));
	}

}
