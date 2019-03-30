package com.Class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[6];

		names[0] = "Danny";
		names[1] = "Oz";
		names[2] = "Jose";
		names[3] = "Nelson";
		names[4] = "Kenny";
		names[5] = "Todd";

		System.out.println("-------- For Loop ---------");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("--------For Loop--------------");
		String[] StudentNames = { "Danel", "Chris", "Cassie", "Ivania", "Mickey", "Dq" };

		for (int i = 0; i <=StudentNames.length-1; i++) {
			System.out.println(StudentNames[i]);
		}
		
		System.out.println("----------Advanced For Loop---------");
		for(String Student:StudentNames) {
			System.out.println(Student);
		}
		
	}

}
