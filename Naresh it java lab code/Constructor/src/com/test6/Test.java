package com.test6;

public class Test {
	private Test (int x) {   //line 1
		System.out.print(x);
	}	
	private static Test() {    //line 2
		System.out.print(25);
	}
	public static void main(String[] args){
		Test t = new Test(35);
	}

}
