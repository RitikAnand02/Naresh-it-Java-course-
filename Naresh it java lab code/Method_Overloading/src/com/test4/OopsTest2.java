package com.test4;

class NIT2
{	int name;
		NIT2(int name)
		{	this.name = name;
		}
}
public class OopsTest2
{	public static void main(String[] args) 
{	NIT2 f1 = new NIT2(10);
	NIT2 f2 = new NIT2(10);
	NIT2 f3 = f2;
	System.out.println(f1==f2);//false
	System.out.println(f2==f3);//true
	System.out.println(f1.name==f2.name);//true
	System.out.println(f2.name==f3.name);//true
	System.out.println(f1!=f3);//true
		}
}

