package com.classTasks;

import java.util.Scanner;

public class Task310 {
	public static void main(String[] args) {
		int sn;
		int en;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter starting number");
		sn = scan.nextInt();

		System.out.println("Please enter ending Number");
		en = scan.nextInt();

		for (int i = sn; i <= en; i++) {
			System.out.println(i);
		}

	}
}
