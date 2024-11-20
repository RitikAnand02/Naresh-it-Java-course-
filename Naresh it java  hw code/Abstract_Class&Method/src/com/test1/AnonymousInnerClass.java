package com.test1;

class Super  //Super.class
{
	public void show()
	{
		System.out.println("Super class show method");
	}
}

public class AnonymousInnerClass //AnonymousInnerClass.class
{
	public static void main(String[] args) 
	{
		//ANONYMOUS INNER CLASS DECLARATION AND OBJECT CREATION
		Super sub = new Super() //AnonymousInnerClass$1.class
		{
			@Override
			public void show()
			{
				//super.show();
				System.out.println("Sub class show method");
			}
			
		};
		sub.show();
				
		//ANONYMOUS INNER CLASS DECLARATION AND OBJECT CREATION
		Super sub1 = new Super() //AnonymousInnerClass$2.class
		{
			@Override
			public void show()
			{
				System.out.println("Sub1 class show method");
			}
			
		};
		sub1.show();

	}

}
