package com.Tasks;

public class NestedIfAgain {
	public static void main(String[] args) {

		double gpa =3.9;
		double expectedGpa = 3.7;

		boolean hasDiploma = true;

		if (hasDiploma) {
			System.out.println("Congrats");
			if (gpa >= expectedGpa) {
				System.out.println("You are Hired");
			} else {
				System.out.println("You are not qaulified");
			}
		} else {
			System.out.println("Please Get Your Diploma");
		}

	}
}
