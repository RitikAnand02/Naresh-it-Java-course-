package com.test1;

public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student(1, "John Smith", 25000.0);
		System.out.println(s1);
		
		System.out.println();
		DayScholar d1 = new DayScholar(2,"Brian Lara",5000.0,2000.0);
		System.out.println(d1.displayDetails());
		double payFee = d1.payFee(10000);
		if(payFee<0) {
			System.out.println("the amount is negative:"+payFee);
		}
		else if(payFee>0) {
			System.out.println("extra amount to pay:"+payFee);
		}
		else {
			System.out.println("All Fees are clear");
		}
		
		System.out.println();
		
		
		
		Hosteller h1 = new Hosteller(3, "Virat Kohli",  2000.0,8000.0);
		System.out.println(h1.displayDetails());
		double payFee2 = h1.payFee(10000);
		if(payFee2<0) {
			System.out.println("the amount is negative:"+payFee2);
		}
		else if(payFee2>0) {
			System.out.println("extra amount to pay:"+payFee2);
		}
		else {
			System.out.println("All Fees are clear");
		}
		

	}

}
