package com.test5;

public class Bread extends Food{
	 private String type = "vegetarian";

	public Bread(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);
		this.tastyScore = 8;
	}

	@Override
	public void getMacroNutrients() {
		 System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");
	}

	@Override
	public String getType() {
		return type;
	}

}
