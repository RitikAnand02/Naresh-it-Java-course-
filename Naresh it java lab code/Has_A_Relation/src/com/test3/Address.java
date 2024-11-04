package com.test3;

public class Address {
     private String street;
     private String city;
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
		}
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

}
