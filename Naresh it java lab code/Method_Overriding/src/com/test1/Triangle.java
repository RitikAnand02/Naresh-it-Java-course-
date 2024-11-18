package com.test1;

 class Triangle extends Shape {

	public Triangle() {
		super();
	}
	@Override
	public void draw(){
		System.out.println("Triangle draw");
	}
	
    @Override
	public void erase(){
		System.out.println("Triangle erase");
	}

}
