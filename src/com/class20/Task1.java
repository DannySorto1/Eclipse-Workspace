package com.class20;

public class Task1 {

	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + emailType;
		return email;
	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		String email = obj.createEmail("john", "snow", "@gmail");
		System.out.println(email);

	}

}
