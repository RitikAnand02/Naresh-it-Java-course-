package com.test1;

 class Square extends Shape {

	public Square() {
		super();
	}
	@Override
	public void draw(){
		System.out.println("Square draw");
	}
	
    @Override
	public void erase(){
		System.out.println("Square erase");
	}
}
