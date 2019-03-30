package com.class5;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* print only odd numbers from 1 to 20 */

		int num = 1;

		while (num <= 20) {

			System.out.println("I am inside while loop");
			// 3%2 =1
			if (num % 2 != 0) {
				System.out.println(num);
			}

			num++;

			// break till 1:45
		}
	}

}
