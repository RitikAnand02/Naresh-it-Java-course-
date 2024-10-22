package com.test11;

 class Base {
	 public Base()
		{
			this(15);
			System.out.println("No Argument Constructor of Base class");
		}
		
		public Base(int x)
		{   
			System.out.println("Parameterized Constructor of Base class :"+x);
		}

}
