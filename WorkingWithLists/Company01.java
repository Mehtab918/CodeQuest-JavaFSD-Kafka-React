package com.skillsoft.collections;

public class Company {
	
	private String name;
	private String country;
		
	public Company(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Country: " + country;
	}

}