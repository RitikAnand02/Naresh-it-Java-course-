package com.test5;

public class Fruit  
{  
private double fprice;  
private String fname;  

Fruit(double fPrice, String fName)  
{   
fprice = fPrice;  
fname = fName;  
}  

Fruit(Fruit fruit)  
{  
System.out.println("\nAfter invoking the Copy Constructor:\n");  
fprice = fruit.fprice;  
fname = fruit.fname;  
}  

double showPrice()  
{  
return fprice;  
}  
 
String showName()  
{  
return fname;  
}  
 
public static void main(String args[])  
{  
Fruit f1 = new Fruit(399, "Ruby Roman Grapes");  
System.out.println("Name of the first fruit: "+ f1.showName());  
System.out.println("Price of the first fruit: "+ f1.showPrice());  
Fruit f2 = new Fruit(f1);  
System.out.println("Name of the second fruit: "+ f2.showName());  
System.out.println("Price of the second fruit: "+ f2.showPrice());  
}  
}
