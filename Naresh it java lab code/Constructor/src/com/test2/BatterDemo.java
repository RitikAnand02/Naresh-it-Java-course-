package com.test2;

import java.util.Scanner;

public class BatterDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter no of runs: ");
		int runs = sc.nextInt();
		System.out.println("Enter no of matches: ");
		int matches = sc.nextInt();
		Batter b1 = new Batter(name,runs,matches);
		
		b1.computeBattingAverage();
		b1.getStatistics();
		sc.close();

	}

}
