package com.test4;

public class College {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.sno = 101;
		s1.sname = "Ritik";
		s1.course = "core java";
		s1.fee = 3500;

		s2.sno = 102;
		s2.sname = "Roushan";
		s2.course = "web desgin";
		s2.fee = 5000;
		s1.getStudent1Info();

		s2.getStudent2Info();
	}

}
