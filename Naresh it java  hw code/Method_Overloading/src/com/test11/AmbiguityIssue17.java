package com.test11;

class Test17
{	
	public void accept(int ...s)
	{
		System.out.println("Var args");
	}	
	public void accept(Integer i)
	{
		System.out.println("Autoboxing");
	}	
}
public class AmbiguityIssue17 {

	public static void main(String[] args) 
	{
		Test17 t = new Test17();
		t.accept(12);        

	}
}

//Here Autoboxing will be executed.
