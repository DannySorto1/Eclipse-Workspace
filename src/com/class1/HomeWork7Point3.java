package com.class1;

import java.util.Scanner;

public class HomeWork7Point3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		String name;
		int num;
		scan = new Scanner(System.in);

		System.out.println("enter the roll number of the Child");
		num = scan.nextInt();

		switch (num) {
		case 101:
			name = "Ramesh";
			break;
		case 102:
			name = "Mahesh";
			break;
		case 103:
			name = "Mukesh";
			break;
		default:
			name = "Not found";

		}
		System.out.println("Student name:"+name);
	}

}
