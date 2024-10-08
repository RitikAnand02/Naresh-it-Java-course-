package com.test1;

public class BankingApplication {

	public static void main(String[] args) {

		Customer scott = new Customer();
		scott.deposit(10000);
		scott.withdraw(5000);

	}

}


//Note : Our balance data is private (Data hiding) so it is not accessible outside of the class, we can accesss via method method with proper data (Data Validation)