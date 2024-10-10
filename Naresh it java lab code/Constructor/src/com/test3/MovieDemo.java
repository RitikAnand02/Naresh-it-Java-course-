package com.test3;

public class MovieDemo {

	public static void main(String[] args) {
		Movie m1 = new Movie("comedy",2000,"user");
		System.out.println(m1);
		m1.setTitle(m1.getTitle()+"Action");
		m1.setReleaseYear(m1.getReleaseYear()+10);
		m1.setGenre(m1.getGenre()+"friendly");
		System.out.println(m1);
		

	}

}
