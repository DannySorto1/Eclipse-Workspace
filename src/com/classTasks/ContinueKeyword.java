package com.classTasks;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 2 && i == 3) {
				continue;
			}
			System.out.println(i);
			System.out.println("Hi");
		}
		for (int a = 1; a <= 20; a++) {
			if (a % 3 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}

}
