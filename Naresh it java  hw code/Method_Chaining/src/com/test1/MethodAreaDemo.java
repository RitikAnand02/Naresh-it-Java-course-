package com.test1;
class Employee{}

class Student{}

class Sample{}

public class MethodAreaDemo {

	public static void main(String[] args) 
	{
		Class cls =   Employee.class;
		System.out.println(cls.getName());
		
		cls = Student.class;
		System.out.println(cls.getName());
		
		cls = Sample.class;
		System.out.println(cls.getName());

	}

}
