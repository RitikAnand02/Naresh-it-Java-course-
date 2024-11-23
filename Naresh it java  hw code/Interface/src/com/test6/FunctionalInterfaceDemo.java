package com.test6;

@FunctionalInterface
interface Payment
{
	double makePayment(double amount);
}

public class FunctionalInterfaceDemo 
{
	public static void main(String[] args) 
	{
		Payment upi = new Payment() 
		{			
			@Override
			public double makePayment(double amount) 
			{
				return amount + 50;
			}
		};
		
		double payment = upi.makePayment(2000);
		System.out.println(payment);

	}

}
