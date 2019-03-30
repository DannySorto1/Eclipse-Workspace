package com.class1;

import java.util.Scanner;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Hello whats your name");

		String name = scan.nextLine();
		System.out.println("Whats Your Gender");

		String hmm = scan.nextLine();
		System.out.println("Hmm Are you sure?");

		String gender = scan.nextLine();
		System.out.println("Whats Your Age");

		int age = scan.nextInt();
		System.out.println("Whats Your Phone Number");

		long number = scan.nextLong();
		System.out.println("Thank You For Your Time");

		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("MobileNumber " + number);

		System.out.println("");
		
	}

}
