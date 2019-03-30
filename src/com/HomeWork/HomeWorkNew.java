package com.HomeWork;

import java.util.Scanner;

public class HomeWorkNew {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1, word2, result = "";
		int num1, num2;

		System.out.println("PLease enter two Strings");
		word1=scan.nextLine();
		word2=scan.nextLine();
		
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		if(num1==num2 && word1.equals(word2)) {
			result="AND";
		}else if(num1==num2 || word1.equals(word2)) {
			result="OR";
		}else if (num1!=num2 && !word1.equals(word2)) {
			result="NONE";
		}
		System.out.println(result);
	}
}
