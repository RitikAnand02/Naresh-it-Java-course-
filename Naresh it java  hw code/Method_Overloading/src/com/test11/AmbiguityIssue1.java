package com.test11;

class Test1
{
	public void accept(double d)
	{
		System.out.println("double");
	}
	public void accept(float d)
	{
		System.out.println("float");
	}	
}
public class AmbiguityIssue1 {

	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		t.accept(6);

	}
}

//Here float will be executed because float is the nearest type.