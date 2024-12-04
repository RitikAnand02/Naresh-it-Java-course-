package com.test;


class Student
{
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
}
public class EqualsMethodDemo1
{
	public static void main(String[] args)
	{
		Student s1 = new Student(111,"Scott");//1000x
		Student s2 = new Student(111,"Scott");//2000x
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //false
		
		
	}

}


//Here we are getting the output as a false because internally equals(Object obj) method of Object class uses == operator only, which is memory address comparison.

