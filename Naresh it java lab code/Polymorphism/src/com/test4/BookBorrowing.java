package com.test4;

public class BookBorrowing {
	private String bookTitle;        
	private String borrowerName;
	public BookBorrowing(String bookTitle, String borrowerName) {
		super();
		this.bookTitle = bookTitle;
		this.borrowerName = borrowerName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getBorrowerName() {
		return borrowerName;
	} 
	
	
}
