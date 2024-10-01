package com.test4;

public class RoundedSum {

	public static int sumOfRoundedValues(int num1,int num2,int num3)  {
		num1=((num1/10)+((num1%10)/5))*10;
		num2=((num2/10)+((num2%10)/5))*10;
		num3=((num3/10)+((num3%10)/5))*10;
		return num1 + num2 + num3;

	}

}
