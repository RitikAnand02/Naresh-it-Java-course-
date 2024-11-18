package com.test3;

 class BankTransferPayment extends Payment {
	 
	 @Override
	   public void  processPayment() {
		   System.out.println("Processing bank transfer payment");
	   }

}
