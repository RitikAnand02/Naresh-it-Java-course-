package com.test5;

public abstract class Food {
	protected double proteins;
	protected double fats;
	protected double carbs;
	protected int tastyScore;
	
	public Food(double proteins, double fats, double carbs) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
	}

	public int getTaste() {
	        return tastyScore;
	    }
	
	public abstract void getMacroNutrients();

	public abstract String getType();

}
