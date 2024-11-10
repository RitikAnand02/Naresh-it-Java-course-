package com.test11;

class Test4
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue4 {

	public static void main(String[] args) 
	{
		Test4 t = new Test4();
		t.accept();

	}
}

//Here we will get compilation error because there is no relation between char and short based on the specific type rule.
