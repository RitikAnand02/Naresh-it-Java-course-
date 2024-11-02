package com.test2;

public class AggregationDemo {

	public static void main(String[] args) 
	{
		College clg = new College("JNTU","Hyderabad");
				
		Student s1 = new Student(1, "Scott", clg);
		System.out.println(s1);
		
		Student s2 = new Student(2, "Smith", clg);
		System.out.println(s2);
		
		Student s3 = new Student(3, "John", clg);
		System.out.println(s3);
		

	}

}


//Note :- IS-A relation is tightly coupled relation so if we modify the content of super class, sub class content will also modify but in HAS-A realtion we are accessing the properties of another class so we are not allowed to modify the content, we can access the content or Properties.