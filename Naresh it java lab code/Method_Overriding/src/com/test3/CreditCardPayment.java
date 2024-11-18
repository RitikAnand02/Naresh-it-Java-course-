package com.test3;

 class CreditCardPayment extends Payment{
	
	   @Override
	   public void  processPayment() {
		   System.out.println("Processing credit card payment");
	   }
}
