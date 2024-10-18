package com.test4;

public class Sample {
	private int x,y;
	
	private Sample(int x, int y) //Private Constructor
	{
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Sample [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) 
	{
		Sample s = new Sample(12, 24);
		System.out.println(s);

	}

}
