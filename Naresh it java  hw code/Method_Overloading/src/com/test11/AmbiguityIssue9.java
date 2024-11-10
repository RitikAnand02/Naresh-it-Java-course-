package com.test11;

class Test9
{
	public void accept(int d, long l)
	{
		System.out.println("int-long");
	}
	public void accept(long s, int i)
	{
		System.out.println("long-int");
	}	
}
public class AmbiguityIssue9 {

	public static void main(String[] args) 
	{
		Test9 t = new Test9();
		t.accept(9,9);  
       

	}
}

//Here We will get ambiguity issue.