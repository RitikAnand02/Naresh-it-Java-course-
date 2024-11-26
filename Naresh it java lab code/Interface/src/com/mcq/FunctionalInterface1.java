package com.mcq;

@FunctionalInterface
interface Cube
{
	int cube(int b);
}
public class FunctionalInterface1 {
	
	public static void main(String[] args) {
		int a = 21;
		
		Cube cube = b -> b*b*b;
		System.out.println(cube.cube(a));
	}
}
