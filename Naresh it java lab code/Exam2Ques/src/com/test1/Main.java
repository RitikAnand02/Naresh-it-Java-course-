package com.test1;

public class Main {

	public static void main(String[] args) {
		Book  b1 = new Book(1, "main", "james");
     Member m1 = new Member(101, "Ritik", "yes",b1);
     
     System.out.println(m1);
	}

}
