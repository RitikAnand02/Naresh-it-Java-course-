package com.test;

public class AssociationDemo {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101, "Scott", 80);
		
		Trainer.viewStudentProfile(s1);

	}

}