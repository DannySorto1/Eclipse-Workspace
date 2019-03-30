package com.Tasks;

import java.util.Scanner;

public class HomeWork4Point5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner shape = new Scanner(System.in);
		int width;
		int length;
		System.out.println("Please enter the length");
		length = shape.nextInt();
		System.out.println("Please enter the width");
		width = shape.nextInt();
		

		if (length > width) {
			System.out.println("The shape of your object is rectangle");
		} else if (length < width) {
			System.out.println("The shape of your object is rectangle");
		} else {
			System.out.println("The shape of your object is square");
		}

	}

}
