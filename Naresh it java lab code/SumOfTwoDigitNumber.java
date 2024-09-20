class SumOfTwoDigitNumber 
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int digitSum = num%10+num/10;
		System.out.println("Sum of two digit number: " + digitSum);
	}
}
