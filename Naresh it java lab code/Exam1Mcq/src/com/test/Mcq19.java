package com.test;

public class Mcq19 {
	 public static void main(String[] argv)
	    {
	                float f = 10.5f;
			double d = (int) f;
			f += (char)(d += f += d);
			System.out.println(d);
			System.out.println(f);
	    }

}
