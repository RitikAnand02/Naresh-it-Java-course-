package com.test6;
class Product {
	int x;
	int y;
	public Product(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void call() {
		System.out.println("call method called");
	}
}

public class Test2 {
	public static void main (String[] args) {
		Product p = new Product();
		p.call();
	}

}
