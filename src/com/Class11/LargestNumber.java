package com.Class11;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 88, 55 };
		int Largest = 0;

		for (int number : numbers) {
			if (number > Largest) {
				Largest = number;
			}
			
		} System.out.println(Largest);


	}

}
