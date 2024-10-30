package com.test1;

class Test57 { 
	static  int i = 1; 
	public static void main(String[] args) 
	{ 
		static int i = 1; 
		for (Test57.i = 1; Test57.i < 10; Test57.i++) { 
			i = i + 2; 
			System.out.print(i + " "); 
		} 
	} 
}