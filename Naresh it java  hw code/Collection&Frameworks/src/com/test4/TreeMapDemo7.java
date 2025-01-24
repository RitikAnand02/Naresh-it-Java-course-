package com.test4;

//Program on TreeMap constructor to provide user-defined sorting logic


import java.util.TreeMap;

record Student1(Integer studentId, String studentName) 
{
	
}

public class TreeMapDemo7 {

	public static void main(String[] args) 
	{
		TreeMap<Student1,String> tm1 = new TreeMap<Student1,String>((s1,s2)-> s1.studentId().compareTo(s2.studentId()));
		tm1.put(new Student1(222, "Aryan"), "Ameerpet");
		tm1.put(new Student1(111, "Zuber"), "S.R Nagar");	
		System.out.println("Sorted based on the ID :");
		tm1.forEach((k,v)-> System.out.println("Key is :"+k+" value is :"+v));
		
		TreeMap<Student1,String> tm2 = new TreeMap<Student1,String>((s1,s2)-> s1.studentName().compareTo(s2.studentName()));
		tm2.put(new Student1(222, "Aryan"), "Ameerpet");
		tm2.put(new Student1(111, "Zuber"), "S.R Nagar");	
		System.out.println("Sorted based on the Name :");
		tm2.forEach((k,v)-> System.out.println("Key is :"+k+" value is :"+v));
		
		
	}

}
