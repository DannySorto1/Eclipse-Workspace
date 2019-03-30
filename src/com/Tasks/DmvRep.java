package com.Tasks;

import java.util.Scanner;

public class DmvRep {
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you");
		
		
		age=scan.nextInt();
		if(age>=18) {
			System.out.println("You quilify For A DL");
		}else {
			System.out.println("You have to be 18 or Older to qaulify for DL. We can Offer you leaners a permit");
		}
	}
}
