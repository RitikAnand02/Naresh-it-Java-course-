package com.test1;

public class StudentDemo {

	public static void main(String[] args) {
		Student raj = new Student();
		raj.setStudentData(1, "Raj", "Ameerpet");
		System.out.println(raj);
		
		Student smith = new Student();
		smith.setStudentData(2, "Smith", "S.R Nagar");
		System.out.println(smith);

	}

}
