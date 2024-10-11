package com.test5;

public class Inventory {
	String game;
	String developer;
	int stockQuantity;
	public void setInventoryDetails(String game, String developer, int stockQuantity) 
	{

		this.game = game;
		this.developer = developer;
		this.stockQuantity = stockQuantity;
	}
	@Override
	public String toString() {
		return "Inventory [game=" + game + ", developer=" + developer + ", stockQuantity=" + stockQuantity + "]";
	}
	
	
	
	

}
