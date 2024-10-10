package com.test5;

import java.util.Scanner;

public class LoanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal");
		double principal = sc.nextDouble();
		System.out.println("Enter Rate");
		double rate = sc.nextDouble();
		System.out.println("Enter Months");
		int months = sc.nextInt();
		Loan l1 = new Loan(principal,rate,months);
	    double amount=	l1.calculateMonthlyPayment();
		
		double principals = l1.getPrincipal();
		double rates = l1.getRate();
		int month = l1.getMonths();
		
		if(principals<=0.0) 
		{
				System.err.println("error");
				System.exit(0);
		}
		if(rates<=0.0) 
		{
				System.err.println("error");
				System.exit(0);
		}
		if(month<=0.0) 
		{
				System.err.println("error");
				System.exit(0);
		}
		
		else
		{
			System.out.println("Principal "+principals);
			System.out.println("Rate "+rates);
			System.out.println("Months "+month);
			System.out.println("Total Amount "+amount);
		}
        sc.close();
	}

}
