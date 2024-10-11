package com.test2;

public class Owner {
	String ownerName;
	int ownerId;
	String address;
	public void setOwnerDetails(String ownerName, int ownerId, String address) 
	{
		this.ownerName = ownerName;
		this.ownerId = ownerId;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Owner [ownerName=" + ownerName + ", ownerId=" + ownerId + ", address=" + address + "]";
	}
	
	
	
	

}
