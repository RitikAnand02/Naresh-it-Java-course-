package com.test1;

//Dynamic Polymorphism by using instanceof Operator :
class Animal1
{
	public void sleep()
	{
		System.out.println("Generic Animal is sleeping");
	}
}
class Lion1 extends Animal1   
{
	@Override
	public void sleep()
	{
		System.out.println("Lion is sleeping");
	}
	
	public void roar()
	{
		System.out.println("Lion is roaring");
	}	
	
}
class Dog1 extends Animal1
{
	@Override
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
	
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}

public class MethodOverriding3 
{
	public static void main(String[] args) 
	{
		Animal1 a = new Lion1();			
		accept(a);	
		
		Animal1 a1 = new Dog1();
		accept(a1);
	}
	
	public static void accept(Animal1 animal) //Loose Coupling
	{
		if(animal instanceof Lion1)
		{
			Lion1 lion = (Lion1) animal;
			lion.sleep();
			lion.roar();
		}
		
		System.out.println("..........");
		
		if(animal instanceof Dog1)
		{
			Dog1 dog = (Dog1) animal;
			dog.sleep();
			dog.bark();
		}
		
	}	
}
