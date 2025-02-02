package com.test;

class Outer1
{
	private int x = 100;
	
	public class Inner
	{
		private int x = 200;
		
		public void access()
		{
			System.out.println("Inner class x variable is :"+this.x);
			System.out.println("Outer class x variable is :"+Outer1.this.x);
		}		
	}	
}

public class VariableShadow {

	public static void main(String[] args) 
	{
		Outer1.Inner in = new Outer1().new Inner();
		in.access();
		
	}

}
