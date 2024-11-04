package com.test2;

public class Order {
	private String orderId;
	private String productName;
	public Order(String orderId, String productName) {
		super();
		if(Integer.parseInt(orderId)<=0) {
				System.err.println("Invalid Input");
				System.exit(0);
			}
			else {
		this.orderId = orderId;
		this.productName = productName;
		}
	}
	public String getOrderId() {
		return orderId;
	}
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}
}
