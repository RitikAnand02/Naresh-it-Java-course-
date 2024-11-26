package com.test6;

public class InstagramUser extends User{

	public InstagramUser(String name) {
		super(name);
	}
	
	public void sendDirectMessage(String message) {
        System.out.println("Instagram direct message from " + getName() + ": " + message);
	}

}
