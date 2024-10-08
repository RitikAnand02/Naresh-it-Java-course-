package com.test1;

public class Customer {
	   private double balance = 10000;  //Data Hiding
	   
	   public void deposit(double amount)
	   {
		   if(amount <=0)
		   {
			   System.err.println("Amount can't be deposited");
		   }
		   else
		   {
		   this.balance = this.balance + amount;
		   System.out.println("Balance After deposit :"+this.balance);
		   }
	   }
	   
	   public void withdraw(double amount)
	   {
		   this.balance = this.balance - amount;
		   System.out.println("Balance after withdraw is :"+this.balance);
	   } 

}
