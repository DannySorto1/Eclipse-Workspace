package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		int age;
		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();

		if (age >= 1 && age < 3) {
			System.out.println("You are a baby");
		} else if (age >= 3 && age < 5) {
			System.out.println("You are a toddler");
		} else if (age >= 5 && age < 13) {
			System.out.println("You are a kid");
		}else if(age>=13 && age<20) {
			System.out.println("You are a Teenager");
		}else if(age>=20 && age<64) {
			System.out.println("You are a adult");
		}else {
			System.out.println("You are senoir citizen");
		}
	}

}
