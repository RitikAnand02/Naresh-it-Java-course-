package com.test5;

import java.util.ArrayList;
import java.util.List;
abstract class Animal1
{
	public abstract void checkup();
}

class Dog2 extends Animal1
{
    @Override
	public void checkup()
	{
		System.out.println("Dog checkup");
	}
}

class Cat1 extends Animal1
{
	@Override
	public void checkup()
	{
		System.out.println("Cat checkup");
	}
}
class Bird1 extends Animal1
{
	@Override
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}
public class Test9
{
	
	public void checkAnimals(List<Animal1> animals)  
	{
		for(Animal1 animal : animals)
		{
             animal.checkup();
		}
	}
	public static void main(String[] args) 
	{
		List<Dog2> dogs = new ArrayList<>();
		dogs.add(new Dog2());
		dogs.add(new Dog2());

		List<Cat1> cats = new ArrayList<>();
		cats.add(new Cat1());
		cats.add(new Cat1());

		List<Bird1> birds = new ArrayList<>();
		birds.add(new Bird1());
		birds.add(new Bird1());
		
		Test9 t = new Test9();
		t.checkAnimals(dogs);
		t.checkAnimals(cats);
		t.checkAnimals(birds);

	}
}


//Note :- The above program will generate compilation error.
//
//So from the above program it is clear that polymorphism does not work in the same way for generics as it does with arrays.

