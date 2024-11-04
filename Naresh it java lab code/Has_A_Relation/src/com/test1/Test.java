package com.test1;

public class Test {

	public static void main(String[] args) 
	{
		   Engine engine = new Engine("Hybrid");
           Car car = new Car("Hyundai", "camery", engine);
           System.out.println(car);
	}

}
