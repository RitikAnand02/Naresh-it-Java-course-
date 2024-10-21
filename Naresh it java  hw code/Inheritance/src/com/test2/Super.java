package com.test2;

 class Super {

	   private int x;  //Data Hiding
	   private int y;
	   
	   public void setData(int x, int y)
	   {
		  this.setX(x);
		  this.setY(y);
	   }

		public int getX() 
		{
			return x;
		}

		public void setX(int x) 
		{
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}   

}
