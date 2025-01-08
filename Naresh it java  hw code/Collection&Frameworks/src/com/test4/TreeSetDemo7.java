package com.test4;

//TreeSet with custom object to sort the data in different criteria

import java.util.TreeSet;

record Student(Integer studentId, String studentName)
{
	
}

public class TreeSetDemo7 
{
	public static void main(String[] args) 
	{
	   TreeSet<Student> ts1 = new TreeSet<>((st1, st2)->st1.studentId().compareTo(st2.studentId()) );
	   ts1.add(new Student(444, "Aryan"));
	   ts1.add(new Student(111, "Zuber"));
	   ts1.add(new Student(222, "Raj"));
	   ts1.add(new Student(333, "Rahul"));
	   System.out.println("Sorting based on the Id :");
	   ts1.forEach(std -> System.out.println(std));
	   
	   TreeSet<Student> ts2 = new TreeSet<>((st1, st2)->st1.studentName().compareTo(st2.studentName()));
	   ts2.add(new Student(444, "Aryan"));
	   ts2.add(new Student(111, "Zuber"));
	   ts2.add(new Student(222, "Raj"));
	   ts2.add(new Student(333, "Rahul"));
	   System.out.println("Sorting based on the Name :");
	   ts2.forEach(std -> System.out.println(std));
	}

}
