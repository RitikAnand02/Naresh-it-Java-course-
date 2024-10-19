package com.test;
class Test1
{
	 final int A;
	 
	{
		A = 100;
	}
}

public class BlankFinalField2 {
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		System.out.println(t1.A);
	}

}

//Note : We can initialize the blank final field inside the non static block.
