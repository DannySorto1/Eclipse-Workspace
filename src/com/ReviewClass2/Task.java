package com.ReviewClass2;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 5; a++) {
			for (int b = 5; b >= a; b--) {
				if (b <= a) {
					System.out.print(a);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
