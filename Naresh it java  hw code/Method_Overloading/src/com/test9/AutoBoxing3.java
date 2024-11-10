package com.test9;

//Integer.valueOf(String str)
//Integer.valueOf(String str, int radix/base)
public class AutoBoxing3 
{
	public static void main(String[] args) 
	{
			Integer a = Integer.valueOf(15);
			
			Integer b = Integer.valueOf("25");

          Integer c = Integer.valueOf("111",36); //Here Base we can take upto 36

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
         
	}
}
