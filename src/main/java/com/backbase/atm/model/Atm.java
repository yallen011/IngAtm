package com.backbase.atm.model;

public class Atm {

	private Address address;
	String distance;
	String type;
	
	public Atm() {
		super();
	}

	public Atm(Address address) {
		setAddress(address);
	}
	
	

	public Atm(Address address, String distance, String type) {
		super();
		this.address = address;
		this.distance = distance;
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atm: address=").append(address).append(", distance=").append(distance).append(", type=")
				.append(type).append("");
		return builder.toString();
	}

	
}
