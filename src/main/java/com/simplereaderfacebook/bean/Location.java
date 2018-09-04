package com.simplereaderfacebook.bean;

public class Location {

	private String city;
	
	private String country;
	
	private float latitude;
	
	private float longitude;
	
	private String street;

	@Override
	public String toString() {
		return "Location [city=" + city + ", country=" + country + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", street=" + street + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}