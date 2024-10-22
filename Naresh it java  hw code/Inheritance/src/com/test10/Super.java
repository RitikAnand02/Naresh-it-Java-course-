package com.test10;

 class Super {
	 public Super()
		{
			System.out.println("No Argument Constructor of super class");
		}
		public Super(int x)
		{
			this();
			System.out.println("Parameterized Constructor of super class :"+x);
		}

}
