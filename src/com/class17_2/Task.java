package com.class17_2;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		int startRange;
		int endRange;
		int sumEven = 0;
		int sumOdd = 0;

		scan = new Scanner(System.in);
		System.out.println("Please enter the start and end points of the range");
		startRange = scan.nextInt();
		endRange = scan.nextInt();

		for (int i = startRange; i <= endRange; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
			}
		System.out.println("The sum of Odd numbers in your range " + startRange + " to " + endRange + " is " + sumOdd);
		System.out.println("The sum of Even numbers in your range " + startRange + " to " + endRange + " is " + sumEven);
	}

}
