package com.class22;

public class SyntaxStudent {

	public static String schoolName = "Syntax";
	public static int batchNumber = 4;

	public String studentName;
	public String studentLastName;

	public SyntaxStudent(String name, String lastName) {
		studentName = name;
		studentLastName = lastName;

	}

	public SyntaxStudent(int a, int b) {

	}

	public void StudentInfo() {
		String details = "I am a at Student at " + schoolName + " From batch " + batchNumber + " and My name is "
				+ studentName + " " + studentLastName;
		System.out.println(details);
	}

}
