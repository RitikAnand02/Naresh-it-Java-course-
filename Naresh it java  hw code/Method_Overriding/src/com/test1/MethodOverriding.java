package com.test1;

//Progrm that describes Polymorphic behaviour of sub classes :

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
}
class Dog extends Animal
{
	@Override
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
}

public class MethodOverriding 
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
	}	
}

//Note : Based on the Object, JVM will call appropriate method.
