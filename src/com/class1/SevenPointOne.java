package com.class1;

import java.util.Scanner;

public class SevenPointOne {

	public static void main(String[] args) {
		Scanner scan;
		String teacher;
		String Job;

		scan = new Scanner(System.in);
		System.out.println("enter name of the instructor");
		teacher = scan.nextLine();

		switch (teacher) {
		case "Shiva":
			Job = "Will take care of Java Assignment";
			break;
		case "Sandish":
			Job = "Will take care of SDLC Assignment";
			break;
		case "Weqas":
			Job = "Will take care of Selenium Assignment";
			break;
		case "Asel":
			Job = "Will take care of every Assignment";
			break;
		default:
			Job = " Invalid instructor selected";
		}
System.out.println(Job);
	}

}
