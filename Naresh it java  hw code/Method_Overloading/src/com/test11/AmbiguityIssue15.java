package com.test11;

class Test15
{	
	public void accept(Number s)
	{
		System.out.println("Number");
	}	
	public void accept(Integer i)
	{
		System.out.println("Integer");
	}	
}
public class AmbiguityIssue15 {

	public static void main(String[] args) 
	{
		Test15 t = new Test15();
		t.accept(12);        

	}
}

//Here Integer will be executed.
