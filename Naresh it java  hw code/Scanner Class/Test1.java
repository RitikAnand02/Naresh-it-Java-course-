// How to read age from Sacnner class :
// -------------------------------------

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :");
		int age = sc.nextInt();
		System.out.println("Your Age is :" + age);
		sc.close();
	}

}