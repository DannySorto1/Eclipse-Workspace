package com.class17;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOrOdd obj = new EvenOrOdd();
		obj.evenOrOddNum(2);
	}

	void evenOrOddNum(int a) {
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}