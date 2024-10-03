package com.test3;

public class BankAccount {
	String bankName;
	String branchName;
	String ifsc;

	long accNum;
	String accHName;
	double balance;

	public void getAccount1Info() {
		System.out.println("acc1 detials");
		System.out.println("------------------------------");
		System.out.println(" acc1.bankName\t: " + bankName);
		System.out.println(" acc1.branchName: " + branchName);
		System.out.println(" acc1.ifsc\t: " + ifsc);
		System.out.println(" acc1.accNum\t: " + accNum);
		System.out.println(" acc1.accHName\t: " + accHName);
		System.out.println(" acc1.balance\t: " + balance);
	}

	public void getAccount2Info() {
		System.out.println("\nacc2 detials");
		System.out.println("------------------------------");
		System.out.println(" acc2.bankName\t: " + bankName);
		System.out.println(" acc2.branchName: " + branchName);
		System.out.println(" acc2.ifsc\t: " + ifsc);
		System.out.println(" acc2.accNum\t: " + accNum);
		System.out.println(" acc2.accHName\t: " + accHName);
		System.out.println(" acc2.balance\t: " + balance);
	}
}
