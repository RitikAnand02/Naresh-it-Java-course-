package com.test11;

class Alpha
{
}
class Beta extends Alpha
{
}
class Test14
{	
	public void accept(Alpha s)
	{
		System.out.println("Alpha");
	}	
	public void accept(Beta i)
	{
		System.out.println("Beta");
	}	
}
public class AmbiguityIssue14 {

	public static void main(String[] args) 
	{
		Test14 t = new Test14();
		t.accept(null);        

	}
}

//Here Beta will be executed.