package com.test1;

public class Shape {
	
	public Shape() {
		super();
	}

	public static Shape randshape(){
		int randomnum =(int)(Math.random()*3);
		
		switch(randomnum) {
		case 0 : return new Circle();
		        
		
		case 1: return new Triangle();
	
		
		case 2: return new Square();
		
		
		default: System.err.println("Invalid Input");
		}
		return null;
		
	
	}
	public void draw(){
		System.out.println("shape draw");
	}
	
	public void erase(){
		System.out.println("Shape erase");
	}
}
