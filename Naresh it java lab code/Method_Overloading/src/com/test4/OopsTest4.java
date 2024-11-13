package com.test4;

class NIT5
{
	public int nit() { 
		return 10;
	}
	
	protected  int nit1() 
	{
		return 5;
	}
}

class NIT6 extends NIT5
{
	@Override
	public int nit() {
		return super.nit();
	}
	
	public int nit1() 
	{
		return 15;
	}
	
	private int nit2() 
	{
		return 20;
	}
}

class NIT7 extends NIT6
{
	public int nit() 
	{
		return 0;
		
	}
	
	public int nit1() 
	{
		return 50;
	}
}
class OopsTest4
{
	public static void main(String[] args) {
		NIT5 object = new NIT5();
		NIT5 object1 = new NIT6();
		NIT5 object2 = new NIT7();
		
		NIT6 object3 = new   NIT7(); 		System.out.println(object.nit()+object1.nit1()+object1.nit()+object3.nit1()+object2.nit1());
	}
}
