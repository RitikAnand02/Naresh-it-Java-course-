package com.test;
class Test4
{
	final int A;			
	
	public Test4()
	{
	   A = 100;
	}
	
	public Test4(int x)
	{
		A = x;		
	}
}

public class BlankFinalField5 {
	public static void main(String[] args) 
	{
		Test4 t1 = new Test4(); 
		System.out.println(t1.A);
		
		Test4 t2 = new Test4(200); 
		System.out.println(t2.A);
	}
}

//Blank final field nust be initialized by all the constructors available in the class.

