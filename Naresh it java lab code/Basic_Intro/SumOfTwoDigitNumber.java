class SumOfTwoDigitNumber 
{
	public static void main(String[] args) 
	{
		int num1 = Integer.parseInt(""+args[0].charAt(0));
		int num2 = Integer.parseInt(""+args[0].charAt(1));
		int sum = num1 + num2;
		System.out.println("Sum of digit is : "+num1+" + "+num2+" = "+sum);
	}
}