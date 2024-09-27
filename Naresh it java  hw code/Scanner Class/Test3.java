// How to read gender from the Client using Scanner class :
// --------------------------------------------------------

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gender :");
		char gender = sc.next().charAt(0);		
		System.out.println("Your Gender is :"+gender);
	    sc.close();
		

	}
}
