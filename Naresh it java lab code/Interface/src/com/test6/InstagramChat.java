package com.test6;

public class InstagramChat implements Messanger {

	@Override
	public void sendMessage(User user) {
	     if (user instanceof InstagramUser) {
	            user.displayMessage("Hello! This is an Instagram chat.");
	        } else {
	            System.err.println("Error: User is not an Instagram user.");
	        }
		
	}

}
