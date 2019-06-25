package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enetr a number");

		try {
			int num1 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please Only Enter Integer Value");
		}

	}

}
