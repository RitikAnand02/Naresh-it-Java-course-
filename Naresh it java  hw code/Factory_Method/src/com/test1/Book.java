package com.test1;

public class Book {
	private String bookTitle;
	private String authorName;

	public Book(String bookTitle, String authorName) 
	{
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}
	
	public static Book getBookObject()
	{
		return new Book("Java", "James Gosling");
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}

}
