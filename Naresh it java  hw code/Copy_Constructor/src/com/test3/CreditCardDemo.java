package com.test3;

import java.util.Scanner;

public class CreditCardDemo {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter Customer Name :");
		String name = sc.nextLine();
		System.out.print("Enter Customer Credit Points  :");
		int crediPoint = sc.nextInt();
		
		Customer cust = new Customer(name, crediPoint);
		
		CardType offeredCard = CardsOnOffer.getOfferedCard(cust);
		System.out.println(offeredCard);
		sc.close();
		

	}

}
