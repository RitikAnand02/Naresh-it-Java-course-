package com.test11;

class Test5
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(byte ...d)
	{
		System.out.println("byte");
	}	
}
public class AmbiguityIssue5 {

	public static void main(String[] args) 
	{
		Test5 t = new Test5();
		t.accept();

	}
}

//Here byte will be executed because byte is the specific type.