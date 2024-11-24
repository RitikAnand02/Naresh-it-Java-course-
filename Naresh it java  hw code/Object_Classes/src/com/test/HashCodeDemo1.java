package com.test;

class Foo
{
	
}
public class HashCodeDemo1 {

	public static void main(String[] args) 
	{
		Foo f1 = new Foo();
		Foo f2 = new Foo();		
		System.out.println(f1.equals(f2)); //false
		System.out.println(f1.hashCode() +" : "+f2.hashCode());
		
		System.out.println("....................");
		Foo f3 = new Foo();
		Foo f4 = f3;
		System.out.println(f3.equals(f4)); //true
		System.out.println(f3.hashCode() +" : "+f4.hashCode());

	}

}
