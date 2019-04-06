package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		ScannerMethod obj = new ScannerMethod();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		obj.sum(a, b);
	}

	 int sum(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
}
