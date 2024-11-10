package com.test11;

class Test2
{
	public void accept(int d)
	{
		System.out.println("int");
	}
	public void accept(char d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue2 {

	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		t.accept(6);

	}
}

//Here int will be executed because int is the nearest type.
