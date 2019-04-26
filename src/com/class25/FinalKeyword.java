package com.class25;

public class FinalKeyword {

	public static final String name = "SYNTAX";

	public static void main(String[] args) {
		/*
		 * Final Keyword can be used in 3 places 1. final variables--we CANNOT change their value--> CONSTANT 
		 * 2.methods- we CANNOT OVERRIDE final Methods
		 * 3.classes- CANNOT Have Any Child Classes
		 */

		final String str = "Hello";
//		name="School";

	}

	public final void hello() {
		System.out.println("Hello from Parent class");
	}

}

class ChildOfFinal extends FinalKeyword {
	//CANNOT OVERRIDE FINAL METHOD
//	public void hello() {
//		System.out.println("Hello from Parent class");
//	}
}
