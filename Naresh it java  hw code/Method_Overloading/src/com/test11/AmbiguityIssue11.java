package com.test11;

class Test11
{
	public void accept(Object s)
	{
		System.out.println("Object");
	}
	public void accept(String s)
	{
		System.out.println("String");
	}	
}
public class AmbiguityIssue11 {

	public static void main(String[] args) 
	{
		Test11 t = new Test11();
		t.accept("NIT");  
       

	}
}

//Here String will be executed