package com.test1;

public class Book {
  private  int bookId;
  private  String title;
  private  String author;
public Book(int bookId, String title, String author) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.author = author;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
}

}
