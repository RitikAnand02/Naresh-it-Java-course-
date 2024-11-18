package com.test3;

public class Main {

	public static void main(String[] args) {
		
		processMultiplePayments(new Payment(),new CreditCardPayment(), new PayPalPayment(), new BankTransferPayment());
	}
		public static void processMultiplePayments(Payment... payments) {
			
			for(Payment X:payments)
			{
				X.processPayment();
			}
			
		}

	

}
