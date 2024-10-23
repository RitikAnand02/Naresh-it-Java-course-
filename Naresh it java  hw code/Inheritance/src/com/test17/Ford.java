package com.test17;

 class Ford extends Car{

	protected String fordModel;

	public Ford(String name, String fordModel) {
		super(name);
		this.fordModel = fordModel;
	}

	@Override
	public String toString() {
		return "Ford [name=" + name + ", fordModel=" + fordModel + "]";
	}

	
	
	
	 
	

}
