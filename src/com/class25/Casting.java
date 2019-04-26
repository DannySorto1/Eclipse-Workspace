package com.class25;

public class Casting {
	public static void main(String[] args) {
//Implicit/Automatic/Widening--complier takes care of conversion
		double a = 10;
		System.out.println(a);

		// Explicit/Manual/Narrowing--programmer takes care of conversion
		double b = 10.0;
		int c = (int) b;

		int i = 130;
// byte by=130;--> conpiler wont allow

		byte by = (byte) i;
		System.out.println(by);

		// upCasting--> Compiler takes care of the conversion
		Payment pay = new MasterCard();
		// MasterCard mc=new Payment();----> Compiler wont allow

		// DownCasting
		MasterCard mc = (MasterCard) new Payment();
	}
}
