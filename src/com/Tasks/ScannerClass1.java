package com.Tasks;

import java.util.Scanner;

public class ScannerClass1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String name = input.nextLine();
		System.out.println("Good Morning " + name);

	}

}
