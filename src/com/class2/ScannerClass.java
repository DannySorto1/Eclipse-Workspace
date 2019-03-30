package com.class2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
//Scanner Class in Java. Scanner is a class in java.util package used for obtaining the input of the primitive
//types like int, double etc. and strings. 		

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Hello, what is your name?");

		String userName = myScanner.nextLine();
		System.out.println("hello " + userName + " , how are you today?");

		String feel = myScanner.nextLine();
		System.out.println(feel + "! thats Great me too! What are Your Plans for today?");

		String plans = myScanner.nextLine();
		System.out.println("Thats awesome, Have a good day. See ya Next Time");
	}

}
