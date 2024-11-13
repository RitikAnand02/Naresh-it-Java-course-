package com.test4;

class NIT
{
	int a;
	public NIT(int a) {
		this.a=a;
	}
	static int getNum()
	{
		return this.a;
	}
}
class NIT3 extends NIT
{
	int a;
	public NIT3(int a,int b) {
		super(a);
		this.a=b;
	}
	int getVal()
	{
		return this.a;
	}
}
class OopsMCQ{
public static void main(String[] args) {
	NIT3 nit = new NIT3(74,152);
	System.out.print(nit.getNum()+" "+nit.getVal());
	}
}
