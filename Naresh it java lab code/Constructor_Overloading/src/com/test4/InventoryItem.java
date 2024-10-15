package com.test4;

public class InventoryItem {
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;
	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
	}
	@Override
	public String toString() {
		return "InventoryItem [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityInStock="
				+ quantityInStock + "]";
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
    
    
	public double calculateTotalValue() {
		double totalValue=0;
		if(this.itemName.length()==0) {
			System.err.println("Error message indicating invalid item name.");
			System.exit(0);
		}
		else if (this.pricePerUnit<0) {
			System.err.println("Error message indicating invalid price.");
			System.exit(0);
		}
		else if (this.quantityInStock<0) {
			System.err.println("Error message indicating invalid quantity.");
			System.exit(0);
		}
		else {
			 totalValue = this.pricePerUnit * this.quantityInStock;
		}
		return totalValue;
	}
}
