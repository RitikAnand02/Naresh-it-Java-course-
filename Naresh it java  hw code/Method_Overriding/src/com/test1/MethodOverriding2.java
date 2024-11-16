package com.test1;

class Animal
{
	public void sleep()
	{
		System.out.println("Generic Animal is sleeping");
	}
}
class Lion extends Animal   
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
class Dog extends Animal
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

public class MethodOverriding2 
{
	public static void main(String[] args) 
	{
		Animal a = new Lion();			
		accept(a);
		
		Animal a1 = new Dog();			
		accept(a1);
	}
	
	public static void accept(Animal animal)
	{
		animal.sleep();
		
		Lion lion = (Lion) animal; //Downcasting
		lion.roar();
		
	}	
}

//Note : Here we will get java.lang.ClassCastException because Dog object can't be converted into lion type.