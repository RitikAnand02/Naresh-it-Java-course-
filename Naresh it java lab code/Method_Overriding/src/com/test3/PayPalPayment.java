package com.test3;

 class PayPalPayment extends Payment{
	
	   @Override
	   public void  processPayment() {
		   System.out.println("Processing PayPal payment");
	   }
}
