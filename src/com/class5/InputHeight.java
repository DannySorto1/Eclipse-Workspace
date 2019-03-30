package com.class5;

import java.util.Scanner;

public class InputHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Height;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter your height in inches please");
		Height = scan.nextInt();
		if (Height >= 1 && Height < 60) {
			System.out.println("Short");
		} else if (Height >= 60 && Height < 72) {
			System.out.println("Medium");
		} else if (Height >= 72 && Height < 98) {
			System.out.println("Tall");
		}
	}

}
