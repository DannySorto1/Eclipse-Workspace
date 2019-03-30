package com.class12;

import java.util.Scanner;

public class HW5point8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {

			num[i] = input.nextInt();

		}

		for (int b = 0; b < num.length; b++) {
			System.out.println(num[b] * 10);

		}
	}

}
