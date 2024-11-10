package com.test11;

class Test16
{	
	public void accept(long s)
	{
		System.out.println("Widening");
	}	
	public void accept(Integer i)
	{
		System.out.println("Autoboxing");
	}	
}
public class AmbiguityIssue16 {

	public static void main(String[] args) 
	{
		Test16 t = new Test16();
		t.accept(12);        

	}
}

//Here widening is having more priority
