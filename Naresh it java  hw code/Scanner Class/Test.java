// How to read your Name from the keyword :
// ---------------------------------------

import java.util.*;
public class Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.nextLine();
		System.out.println("Your Name is :"+name);
		sc.close();
	}
}