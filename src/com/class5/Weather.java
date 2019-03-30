package com.class5;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		boolean rain, snow, sunny;
		int temp;
		String activity;
		Scanner scan;

		scan = new Scanner(System.in);

		System.out.println("Whats the temperture");
		temp = scan.nextInt();

		if (temp >= 40 && temp < 80) {
			System.out.println("Is it raining");
			rain = scan.hasNext();

			if (rain) {
				activity = "Watch a movie";
			} else {
				activity = "Go hiking";
			}

		} else if (temp >= 25 && temp < 40) {
			System.out.println("Is it Snowing");
			snow = scan.nextBoolean();

			if (snow) {
				activity = "snowboarding";
			} else {
				activity = "lets code";
			}

		} else if (temp >=80) {
			System.out.println("Is it Sunny");
			sunny = scan.nextBoolean();

			if (sunny) {
				activity = "Go to the Beach";
			} else {
				activity = "Lets code";
			}
		}else {
			System.out.println("Please enetr Different Temperature");
			activity="unkown";
		}
System.out.println("My activity for today is "+activity);
	}
}
