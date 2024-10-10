package com.test5;

public class Loan {
	private double principal;
	private double rate;
	private int months;
	public Loan(double principal, double rate, int months) 
	{
		super();
		this.principal = principal;
		this.rate = rate;
		this.months = months;
	}
	
	public double calculateMonthlyPayment() {
		double amount = (principal *rate*months) /100;
		return amount;
	}

	public double getPrincipal() {
		return principal;
	}

	public double getRate() {
		return rate;
	}

	public int getMonths() {
		return months;
	}

}
