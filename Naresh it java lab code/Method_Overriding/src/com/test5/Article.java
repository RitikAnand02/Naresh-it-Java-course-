package com.test5;

 class Article extends CourseContent {
	 private String author;

	public Article(String title, String author) {
		super(title);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	 

}
