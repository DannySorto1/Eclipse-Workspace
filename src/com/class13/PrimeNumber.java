package com.class13;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime");
		number = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {

			} else {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}
}
