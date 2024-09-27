// How to read Employee Data from Scanner class :
// -----------------------------------------------

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your employee id :");
		int eid = sc.nextInt();

		System.out.print("Enter your employee Name :");
		String ename = sc.nextLine(); // \n
		ename = sc.nextLine(); // read client data

		System.out.println("Employee Id is :" + eid);
		System.out.println("Employee Name is :" + ename);

		sc.close();
	}

}