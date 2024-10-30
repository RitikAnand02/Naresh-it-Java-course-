package com.test1;

class Test54 { 
	static  int x = 10; 
	public  static void main(String[] args) 
	{ 
		Test54 t1 = new Test54(); 
		Test54 t2 = new Test54(); 

		t1.x = 20; 
		System.out.print(t1.x + " "); 
		System.out.println(t2.x); 
	} 
}
