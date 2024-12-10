package com.test;

class Super
{
	public void show()  
	{
		System.out.println("Super class method not throwing checked Exception");
	}
}
class Sub extends Super
{
	@Override
	public void show()  //throws InterruptedException
	{
		System.out.println("Sub class method should not throw checked Exception");
	}
}

public class MethodOverridingWithChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
