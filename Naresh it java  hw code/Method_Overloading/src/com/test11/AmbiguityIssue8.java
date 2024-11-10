package com.test11;

class Test8
{
	public void accept(int d)
	{
		System.out.println("int");
	}
	public void accept(long s)
	{
		System.out.println("long");
	}	
}
public class AmbiguityIssue8 {

	public static void main(String[] args) 
	{
		Test8 t = new Test8();
		t.accept(9);  
       

	}
}

//Note : Here int will be executed because int is the nearest type
