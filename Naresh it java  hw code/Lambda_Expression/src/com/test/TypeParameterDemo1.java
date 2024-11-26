package com.test;

class Basket<T>
{
	private T element;  //element variable is Fruit type

	public T getElement() 
	{
		return this.element;
	}

	public void setElement(T element) //Fruit element = new Apple();
	{
		this.element = element;
	}	
}

class Fruit
{
	
}
class Apple extends Fruit
{
	@Override
	public String toString()
	{
		return "Apple";
	}	
}

class Orange extends Fruit
{
	@Override
	public String toString()
	{
		return "Orange";
	}	
}

public class TypeParameterDemo1 
{
 public static void main(String[] args)
 {
	Basket<Fruit> b = new Basket<Fruit>();
	b.setElement(new Apple());
	         
	Apple apple = (Apple) b.getElement();
	System.out.println(apple);
	
	System.out.println("............");
	b.setElement(new Orange());
	
	Orange orange = (Orange) b.getElement();
	System.out.println(orange);
	
 }
}
