package com.test;

enum MyColor 
{
    RED , BLUE, PINK;     

    static 
	{
        System.out.println("static block ");
    }

    {
        System.out.println("instance block");
    }  

}
public class Test15
{
  public static void main(String[] args) 
	{
	  System.out.println(MyColor.RED);
	}
}
