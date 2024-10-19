package com.test;
class Test3
{
	 final int A;			
	
	{
		m1();
		A = 200;
	}
	
	public void m1()
	{
		System.out.println("Default Value is :"+A);
	}
	
}

public class BlankFinalField4 {
	public static void main(String[] args) 
	{
		Test3 t1 = new Test3();
		System.out.println("User value is :"+t1.A);
	}

}

//Note : A blank final field also have default value.
