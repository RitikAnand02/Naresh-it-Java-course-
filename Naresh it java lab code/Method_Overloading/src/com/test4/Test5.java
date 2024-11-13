package com.test4;

class Check
{
   public void accept(int ...x, float ...y)
   {
      System.out.println(x[0] +":"+y[0]);
   }
}
public class Test5
{
  public static void main(String [] args)
  {
     Check c = new Check();
     c.accept(12,56,89.90F,67.56F);
  }
}
