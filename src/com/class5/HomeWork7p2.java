package com.class5;

import java.util.Scanner;

public class HomeWork7p2 {

	public static void main(String[] args) {
		Scanner scan;
		int age;
		String activity;

		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();

		switch (age) {
		case 1:
			activity = "You can Crawl";
			break;
		case 2:
			activity = "You can Talk";
			break;
		case 3:
			activity = "You can Dance";
			break;
		case 4:
			activity = "You can get  Trouble";
			break;
		default:
			activity = "I don't know how old you are";
		}
		System.out.println(activity);
	}

}
