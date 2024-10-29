// Write a Java program to calculate the factorial of a number where number must be taken from command line argument.

class Factorial
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int f=1;
		while(num>0)
		{
			f=f*num;
			num--;
		}
			System.out.println("Factorial: " + f);	
	}
}
