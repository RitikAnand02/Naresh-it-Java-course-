package com.test11;

class Test6
{
	public void accept(double ...d)
	{
		System.out.println("double");
	}
	public void accept(long ...d)
	{
		System.out.println("long");
	}	
}
public class AmbiguityIssue6 {

	public static void main(String[] args) 
	{
		Test6 t = new Test6();
		t.accept();

	}
}

//Here long will be executed because long is the most specific type.