package com.test5;

//Program that describes the return type of any method can be type safe, We can apply generics on method return type]

import java.util.ArrayList;
import java.util.List;

class Dog
{	
	public List<Dog> getDogList()
	{
		ArrayList<Dog> d = new ArrayList<>();
      d.add(new Dog());
		d.add(new Dog());
		d.add(new Dog());
		return d;
	}
}

public class Test4 
{
	public static void main(String[] args) 
	{
	   Dog d1 = new Dog();		    
	   Dog dog = d1.getDogList().get(1);
	   System.out.println(dog);
	}

}


//Note :- In the above program the compiler will stop us from returning anything which is not compaitable List<Dog> and there is a guarantee that only "type safe list of Dog object" will be returned so we need not to provide type casting as shown below
//Dog d2 = (Dog) d1.getDogList().get(0);  //before generic.