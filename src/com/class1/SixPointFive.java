package com.class1;

import java.util.Scanner;

public class SixPointFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		boolean thristy;
		boolean sleepy;
		String drink;

		scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thristy = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = scan.nextBoolean();

		if (thristy && !sleepy) {
			drink = "Water";

		} else if (thristy && sleepy) {
			drink = "Coffee";

		} else if (!thristy && sleepy) {
			drink = "Tea";

		} else {
			drink = "Nothing";
		}
		System.out.println("Looks like you need to drink " + drink);
	}
}
