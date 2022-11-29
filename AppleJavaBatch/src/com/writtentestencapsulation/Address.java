package com.writtentestencapsulation;

public class Address {
	private String city, state, country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;

	}

	/*
	 * void personData() { System.out.println("City Name :"+city);
	 * System.out.println("State Name :"+state);
	 * System.out.println("Country Name :"+country); }
	 */
	public String toString() {
		return "City Name :" + city + "\nState Name :" + state + "\nCountry Name :" + country;
	}
	/*
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 * 
	 * public String getState() { return state; }
	 * 
	 * public void setState(String state) { this.state = state; }
	 * 
	 * public String getCountry() { return country; }
	 * 
	 * public void setCountry(String country) { this.country = country; }
	 */
}
