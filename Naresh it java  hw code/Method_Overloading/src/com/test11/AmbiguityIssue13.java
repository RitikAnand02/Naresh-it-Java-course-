package com.test11;

class Test13
{
	public void accept(Object s)
	{
		System.out.println("Object");
	}
	public void accept(String s)
	{
		System.out.println("String");
	}	
	public void accept(Integer i)
	{
		System.out.println("Integer");
	}	
}
public class AmbiguityIssue13 {

	public static void main(String[] args) 
	{
		Test13 t = new Test13();
		t.accept(null);        

	}
}

//Here We will get compilation error