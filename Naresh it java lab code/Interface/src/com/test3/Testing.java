package com.test3;

public class Testing {

	public static void main(String[] args) {
		TextPost t1 = new TextPost("textContent");
		t1.publish();
		t1.like();
		System.out.println();
		
		TextPost t2 = new TextPost("Hello, world!");
		t2.publish();
		t2.like();
		t2.like();
		System.out.println();
		
		System.out.println("Post 1: " + t2.getTextContent() + " | Likes: " + t2.getLikes());

	}

}
