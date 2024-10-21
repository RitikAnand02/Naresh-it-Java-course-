package com.test3;

 class Son extends Father{
	 protected double balance = 18000;  //Variable Hiding
		
		public void showBalance()
		{
			System.out.println("Son balance is :"+this.balance);
			System.out.println("Father Balance is :"+super.balance);
		}	

}
