package com.test6;

public class User  {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
	        return name;
   }
	
	public void displayMessage(String message) {
		System.out.println("Message from " + name + ": " + message);
		
	}


}
