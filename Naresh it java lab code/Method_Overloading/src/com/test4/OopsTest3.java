package com.test4;

class NIT4
{
	static int a=90;
	String object;
	public NIT4(String name) {
		this.object=name;
		NIT4.this.a+=1;
	}
	static int get_counter()
	{
		return NIT4.a;
	}
}

public class OopsTest3
{
	public static void main(String[] args) {
		NIT4 nit = new NIT4("nit");
		NIT4 nit1 = new NIT4("nit");
		NIT4 nit2 = new NIT4("nit");
		NIT4 nit3 = new NIT4("nit");
		NIT4 nit4 = new NIT4("nit");
		NIT4 nit5 = new NIT4("nit");
		NIT4 nit6 = new NIT4("nit");
		NIT4 nit7 = new NIT4("nit");
		System.out.println(NIT4.get_counter()-91);
	}
}

