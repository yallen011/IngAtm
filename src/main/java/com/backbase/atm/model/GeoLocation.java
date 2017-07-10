package com.backbase.atm.model;

public class GeoLocation {

	private String lat;
	private String lng;
	
	
	public GeoLocation() {
		super();
	}


	public GeoLocation(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	


	public String getLat() {
		return lat;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}


	public String getLng() {
		return lng;
	}


	public void setLng(String lng) {
		this.lng = lng;
	}
	
	


	@Override
	public String toString() {
		return new StringBuilder().append("GeoLocation: ")
				.append("lat=")
				.append(lat)
				.append(", ")
				.append("lng=")
				.append(", ")
				.append("lng=")
				.append(lng)
				.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lat == null) ? 0 : lat.hashCode());
		result = prime * result + ((lng == null) ? 0 : lng.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeoLocation other = (GeoLocation) obj;
		if (lat == null) {
			if (other.lat != null)
				return false;
		} else if (!lat.equals(other.lat))
			return false;
		if (lng == null) {
			if (other.lng != null)
				return false;
		} else if (!lng.equals(other.lng))
			return false;
		return true;
	}
	
	
	
	
	

}
