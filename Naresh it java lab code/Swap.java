/*
 Write a program to swap to numbers without using 3rd variable using 
    command line argument.
*/

class Swap 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
			
		System.out.println("After Swap a: " + a);
		System.out.println("After Swap b: " + b);
		
		 a = a + b;
		 b = a - b;
		 a = a - b;
		
		System.out.println("Before Swap a: " + a);
		System.out.println("Before Swap b: " + b);
	}
}
