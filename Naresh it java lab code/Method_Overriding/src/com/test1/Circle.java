package com.test1;

 class Circle extends Shape{
	 
	    public Circle() {
		super();
	}

		@Override
		public void draw(){
			System.out.println("Circle  draw");
		}
		
	    @Override
		public void erase(){
			System.out.println("Circle  erase");
		}
}
