package com.test4;

import java.util.Scanner;

public class Bank {
	int Bankifsc;
	String Bankname;
	String Accountholdername;
	int Bankaccount;
	double Bankamount;

	public void setBankData() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Bnak Ifsc Code is: ");

		Bankifsc = sc.nextInt();

		System.out.print("Enter Bank Name is: ");

		Bankname = sc.nextLine();

		System.out.print("Enter Account Holder Name is: ");

		Accountholdername = sc.nextLine();

		System.out.print("Enter account no is: ");

		Bankaccount = sc.nextInt();

		System.out.print("Enter Amount is: ");

		Bankamount = sc.nextInt();
		sc.close();
	}

	public void getBankData() {
		System.out.println("The Bank Ifsc Code is: " + Bankifsc);
		System.out.println("The Bank Name is: " + Bankname);

		System.out.println("The Bnak Account Holder Name is: " + Accountholdername);
		System.out.println("The Bank Account No is: " + Bankaccount);
		System.out.println("The Bank Amount is: " + Bankamount);
	}

}
