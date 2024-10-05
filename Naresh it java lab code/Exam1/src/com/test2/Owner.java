package com.test2;

public class Owner {
	String ownerName;
	int ownerId;
	String address;

	public void setOwnerDetails(String ownerName, int ownerId, String address) {
		this.ownerName = ownerName;
		this.ownerId = ownerId;
		this.address = address;
	}

	public String getOwnerDetails() {

		return "Owner Name: " + ownerName + "\n" + "Owner ID: " + ownerId + "\n" + "Address: " + address;
	}
}
