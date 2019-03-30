package com.HomeWork;

import java.util.Scanner;

public class HomeWork6Point2 {
	public static void main(String[] args) {
		Scanner scan;
		boolean loan;
		int cs;
		String result="";

		scan = new Scanner(System.in);
		System.out.println("Do you want a loan");
		loan = scan.nextBoolean();

		if (loan) {
			System.out.println("Whats Your credit Score");
			cs = scan.nextInt();

			if (cs < 600) {
				result = "Not Eligible";
			} else if (cs >= 600 && cs <= 700) {
				result = "Maybe Eligible";
			} else if (cs >= 701 && cs <= 800) {
				result = "Eligible";
			} else if (cs > 800) {
				result = "Definitely eligible";
			} else {
				result = "Unknown";
			}
			System.out.println("The eligibility is " + result);
		}
		else {
			System.out.println("Unknown");
		}

	}
}
