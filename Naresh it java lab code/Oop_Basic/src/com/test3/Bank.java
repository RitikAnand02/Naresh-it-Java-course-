package com.test3;

public class Bank {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();

		BankAccount acc2 = new BankAccount();

		acc1.bankName = "HDFC";
		acc1.branchName = "SR Nagar";
		acc1.ifsc = "HD123SR";
		acc1.accNum = 123456764353L;
		acc1.accHName = "Ritik";
		acc1.balance = 9845363;

		acc2.bankName = "HDFC";
		acc2.branchName = "SR Nagar";
		acc2.ifsc = "HD123SR";
		acc2.accNum = 123456764373L;
		acc2.accHName = "Roushan";
		acc2.balance = 9845365;

		acc1.getAccount1Info();
		acc2.getAccount2Info();

	}

}
