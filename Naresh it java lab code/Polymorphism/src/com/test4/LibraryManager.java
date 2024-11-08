package com.test4;

public class LibraryManager {
	public static void borrowItem(BookBorrowing borrowing) {
		System.err.println("Error: Book title cannot be empty.");
		
	}
	
	public void borrowItem(DVDBorrowing borrowing) {
		System.err.println("Error: DVD title cannot be empty.");
	}
	
	public void  borrowItem(MagazineBorrowing borrowing) {
		System.out.println("Charlie borrowed the magazine: Time");
		
	}
}
