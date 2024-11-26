package com.test7;

public class NotifierTest {

	public static void main(String[] args) {
	     System.out.println("Test Case 1:");
	        User user1 = new User("Alice", "alice@example.com");
	        User user2 = new User("Bob", "bob@example.com");
	        Notifier emailNotifier = new EmailNotifier();
	        emailNotifier.notifyUsers(user1, user2); 

	      
	        System.out.println("\nTest Case 2:");
	        User user3 = new User("Charlie", "charlie@example.com");
	        emailNotifier.notifyUsers(user3);


	        System.out.println("\nTest Case 3:");
	        User user4 = new User("Frank", null);
	        User user5 = new User("Grace", null);
	        emailNotifier.notifyUsers(user4, user5); 
	}

}
