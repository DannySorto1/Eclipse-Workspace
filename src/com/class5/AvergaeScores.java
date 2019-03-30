package com.class5;

import java.util.Scanner;

public class AvergaeScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quiz;
		double midTerm;
		double finalTest;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter Your quiz score");
		quiz = scan.nextDouble();

		System.out.println("Please enter Your midTerm Score");
		midTerm = scan.nextDouble();

		System.out.println("Please enter Your final test Score");
		finalTest = scan.nextDouble();

		double AS = ((quiz + midTerm + finalTest) / 3);

		if (AS >= 90) {
			System.out.println("Grade A");
		} else if (AS >= 70 && AS < 90) {
			System.out.println("Grade B");
		} else if (AS >= 50 && AS < 70) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade F");
		}
	}

}
