package com.test4;

public class Planet {
	String planetName;
	double mass;
	double radius;
	public void setPlanetDetails(String planetName, double mass, double radius) 
	{
		this.planetName = planetName;
		this.mass = mass;
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Planet [planetName=" + planetName + ", mass=" + mass + ", radius=" + radius + "]";
	}
}
