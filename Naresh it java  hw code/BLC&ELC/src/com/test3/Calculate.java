package com.test3;

public class Calculate 
{
  public static int getSquareAndCube(int num)
  {
	  if(num <=0)
	  {
		  return -1;
	  }
	  else if(num % 2==0)
	  {
		  return (num*num);
	  }
	  else
	  {
		  return (num*num*num);
	  }
  }
  
}
