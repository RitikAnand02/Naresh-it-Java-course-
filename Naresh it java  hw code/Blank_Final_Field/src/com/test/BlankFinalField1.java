package com.test;
class Test
{
	 final int A;
}
public class BlankFinalField1 {
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		System.out.println(t1.A);
	}

}


//Note : It can't be initialized by default constructor.

