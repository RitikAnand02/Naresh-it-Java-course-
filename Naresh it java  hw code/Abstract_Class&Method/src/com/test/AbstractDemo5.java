package com.test;

abstract class Animal
{
	public abstract void checkup();  
}
class Dog extends Animal
{	
	@Override
	public void checkup() 
	{
		System.out.println("Dog is going for checkup");		
	}	
}
class Lion extends Animal
{
	@Override
	public void checkup() 
	{
		System.out.println("Lion is going for checkup");		
	}	
}

class Elephant extends Animal
{
	@Override
	public void checkup() 
	{
		System.out.println("Elephant is going for checkup");		
	}	
}

public class AbstractDemo5 {

	public static void main(String[] args) 
	{
       Dog dogs[] = {new Dog(), new Dog(), new Dog() };       
       Lion lions[] = {new Lion(), new Lion() };       
       Elephant elephants[] = {new Elephant(), new Elephant()};
       
       animalChecking(dogs);
       System.out.println();
       animalChecking(lions);
       System.out.println();
       animalChecking(elephants);
       System.out.println();
	}
	
	public static void animalChecking(Animal ...animals) 
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}
	

}
