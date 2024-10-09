package com.test2;

public class Lion {

	private String lionName;
	private double lionHeight;
	private String lionColor;

	
	public Lion(String lionName, double lionHeight, String lionColor) 
	{
		super();
		this.lionName = lionName;
		this.lionHeight = lionHeight;
		this.lionColor = lionColor;
	}



	@Override
	public String toString() {
		return "Lion [lionName=" + lionName + ", lionHeight=" + lionHeight + ", lionColor=" + lionColor + "]";
	}

}
