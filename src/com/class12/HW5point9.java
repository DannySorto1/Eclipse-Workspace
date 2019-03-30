package com.class12;

import java.util.Scanner;

public class HW5point9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {

			num[i] = input.nextInt();

		}

		for (int i = (5-1); i >= 0; i--) {
			System.out.println(num[i]);

		}
	}
}
