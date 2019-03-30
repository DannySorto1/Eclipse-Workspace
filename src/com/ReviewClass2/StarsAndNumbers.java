package com.ReviewClass2;

public class StarsAndNumbers {

	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 5; b > 0; b--) {
				if(b<=a) {
					System.out.print(a);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
