package com.test3;

public class Registration {
	
	String vehicle;
	String owner;
	String registrationDate;

	public void setRegistrationDetails(String vehicle, String owner, String registrationDate) 
	{
	
		this.vehicle = vehicle;
		this.owner = owner;
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Registration [vehicle=" + vehicle + ", owner=" + owner + ", registrationDate=" + registrationDate + "]";
	}
	
	
	
	

}
