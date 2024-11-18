package com.test4;

 class HostelRoom extends Room{
	 private String bedType;
	 
	 
	 {
		 bedType = null;
	 }

		public void bookRoom() {
			
		}
		
		public void bookRoom(String roomtype,String bedType) {
			super.bookRoom(roomtype);
			if (bedType.isEmpty()) {
				System.err.println("Error: Bed type cannot be null or empty.");
				System.exit(0);
			}
			else {
				this.bedType=bedType;
			}
			
			System.out.println(roomtype+ " with "+bedType);
			
		}
		
		public void cleanRoom() {
				
		}
}
