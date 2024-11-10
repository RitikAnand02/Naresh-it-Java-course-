package com.test4;

import java.text.DecimalFormat;
public class Main 
{
public static void main(String[] args) 
{
Sum s = new Sum();
System.out.println("Sum of two Integer is :"+s.add(12, 24));
System.out.println("Concatenation of two String is :"+s.add("Data", 
"Base"));
double add = s.add(1.2, 2.4);
DecimalFormat df = new DecimalFormat("00.00");
System.out.println("Sum of two double is :"+df.format(add));
}
}