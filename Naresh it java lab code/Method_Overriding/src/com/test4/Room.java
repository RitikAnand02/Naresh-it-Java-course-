package com.test4;

public class Room {
	private String roomType;
	
	{
		 roomType = null;
	}

	
	public void bookRoom() {
		
	}
	
	public void bookRoom(String roomtype) {
		if (roomtype.isEmpty()) {
			System.err.println("Error: Room type cannot be null or empty.");
			System.exit(0);
		}
		else {
			this.roomType=roomtype;
		}
	}

    public void cleanRoom() {
		
	}
}
