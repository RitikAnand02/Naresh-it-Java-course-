package com.test6;

public class InstagramChatTest {

	public static void main(String[] args) {
        User u1 = new User("Alice");
        InstagramUser i1 = new InstagramUser("Ritik");
        InstagramChat c1 = new InstagramChat();
    
        c1.sendMessage(i1); 
        System.out.println();

        c1.sendMessage(u1); 

	}

}
