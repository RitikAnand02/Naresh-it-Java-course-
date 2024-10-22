package com.test13;

 class Circle extends Shape{
	 final double PI = 3.14; 
		public Circle(int radius)
		{
			super(radius);
		}
		
		public void getAreaOfCircle()
		{
			double area = PI * super.x * super.x;
			System.out.println("Area of Circle is :"+area);
		}

}
