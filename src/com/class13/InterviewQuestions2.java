package com.class13;

class InterviewQuestions2 {

	public static void main(String[] args) {
		int[] arr = { 10, 26, 15, 8, 14, 27 };

		int min = arr[0];
		int max = arr[0];
		int secondMax = arr[0];

		for (int a : arr) {

			if (a < min) {
				min = a;

			} else if (a > max) {
				secondMax = max;
				max = a;

			} else if (a > secondMax) {
				secondMax = a;
			}
		}

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Second Max: " + secondMax);
	}
}
