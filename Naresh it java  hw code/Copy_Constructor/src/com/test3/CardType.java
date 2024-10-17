package com.test3;

public class CardType {
	private Customer customer; // HAS-A relation 
	private String cardType;

	public CardType(Customer customer, String cardType) 
	{
		super();
		this.customer = customer;
		this.cardType = cardType;
	}

	@Override
	public String toString()  
	{
		//The Customer 'Rajeev' Is Eligible For 'Gold' Card.
		return "The Customer '"+this.customer+"' Is Eligible For '"+this.cardType+"' Card";
	}

}
