package com.Tasks;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		boolean isTrue;
		Scanner inp = new Scanner(System.in);
		System.out.println("Input the boolean value");
		isTrue = inp.nextBoolean();
		System.out.println("The value is " + isTrue);

	}
}
