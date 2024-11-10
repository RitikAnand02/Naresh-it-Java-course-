package com.test11;

class Test3
{
	public void accept(int ...d)
	{
		System.out.println("int");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue3 {

	public static void main(String[] args) 
	{
		Test3 t = new Test3();
		t.accept();

	}
}

//Here char will be executed because char is the most specific type
