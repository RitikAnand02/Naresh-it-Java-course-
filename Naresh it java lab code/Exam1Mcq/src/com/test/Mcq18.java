package com.test;

public class Mcq18 {
    public static void main(String[] argv)
    {
          int a=1,b=2,c=4,d;
	  d = --c+ ++a - --c+ ++b;
	  c = d;
	  d = --d + ++c;
	  System.out.println(d);
    }

}
