package com.class2;

public class ForLoop {

	public static void main(String[] args) {
//a for-loop (or simply for loop) is a control flow statement for specifying iteration,
//which allows code to be executed repeatedly.
// For-loops are typically used when the number of iterations is known before entering the loop.
		
		for (int i = 2; i <= 4; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int k = 2; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
