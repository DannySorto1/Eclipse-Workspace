package com.class13;

public class InterviewQuestions5 {

	public static void main(String[] args) {
		String str = "Today is Java Class";

		char[] array = str.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.print(array[i]);

		}
	}

}
