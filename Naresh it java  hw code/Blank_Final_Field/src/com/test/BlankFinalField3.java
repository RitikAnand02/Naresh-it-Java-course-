package com.test;
class Test2
{
	 final int A;
	 
		
	public Test2()
	{
		
		A = 200;
	}
	
}

public class BlankFinalField3 {
	public static void main(String[] args) 
	{
		Test2 t1 = new Test2();
		System.out.println(t1.A);
	}
		

}


//Note : We can initialize the blank final field inside the Constructor body [till object creation]
