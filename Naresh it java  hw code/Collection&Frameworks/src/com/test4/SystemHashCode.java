package com.test4;

class Employee1
{
	
}

public class SystemHashCode {

	public static void main(String[] args) 
	{
		String str = "india";
		
		System.out.println("Hashcode of str from String class :"+str.hashCode());		
		System.out.println("System generated Hashcode :"+System.identityHashCode(str));
		
		Employee1 e1 = new Employee1();
		System.out.println("Object class hashcode :"+e1.hashCode());
		System.out.println("System generated Hashcode :"+System.identityHashCode(e1));
		

	}

}