package com.backbase.atm.model;

public class Address {
	
	private String street;
	private String housenumber;
	private String postalcode;
	private String city;
	private GeoLocation geoLocation;
	

	
	public Address() {
		super();
	}


	public Address(String street, String houseNumer, String postalCode, String city, GeoLocation location) {
		setStreet(street);
		setHousenumber(houseNumer);
		setPostalcode(postalCode);
		setCity(city);
		setGeoLocation(location);
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}

	

	public String getHousenumber() {
		return housenumber;
	}


	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}


	public String getPostalcode() {
		return postalcode;
	}


	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation location) {
		this.geoLocation = location;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address: street=").append(street).append(", housenumber=").append(housenumber)
				.append(", postalcode=").append(postalcode).append(", city=").append(city).append(", location=")
				.append(geoLocation);
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((housenumber == null) ? 0 : housenumber.hashCode());
		result = prime * result + ((postalcode == null) ? 0 : postalcode.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (housenumber == null) {
			if (other.housenumber != null)
				return false;
		} else if (!housenumber.equals(other.housenumber))
			return false;
		if (postalcode == null) {
			if (other.postalcode != null)
				return false;
		} else if (!postalcode.equals(other.postalcode))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	
	

}
