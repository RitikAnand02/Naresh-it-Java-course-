package com.test3;

public class Main {

	public static void main(String[] args) {
      FuelTank f1 = new FuelTank(10.0, 15.0);
      f1.refillFuel(10);
      System.out.println();
      
      Car c1 = new Car(f1);
      c1.displayFuelLevel();
      System.out.println();
      
      Motorcycle m1 = new Motorcycle(f1);
      m1.displayFuelLevel();
      
      
	}

}
