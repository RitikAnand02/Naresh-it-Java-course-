package com.test17;

 class Maruti extends Car{
	 protected String marutiModel;

	public Maruti(String name, String marutiModel) {
		super(name);
		this.marutiModel = marutiModel;
	}

	@Override
	public String toString() {
		return "Maruti [name=" + name + ", marutiModel=" + marutiModel + "]";
	}
	 
	

}
