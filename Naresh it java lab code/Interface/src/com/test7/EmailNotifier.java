package com.test7;

public class EmailNotifier implements Notifier {
	
	private void sendEmail(User user) {
		System.out.println("Sending email to " + user.getName() + " at " + user.getEmail());
		
	}

	@Override
	public void notifyUsers(User... users) {
		   for (User user : users) {
	            sendEmail(user);
	        }

	}

}
