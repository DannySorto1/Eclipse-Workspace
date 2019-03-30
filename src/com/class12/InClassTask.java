package com.class12;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		Scanner scan;
		String userName, password, confirmedPassword, message;

		scan = new Scanner(System.in);
		System.out.println("Please enter UserName");
		userName = scan.nextLine();

		System.out.println("Please enter Password");
		password = scan.nextLine();

		System.out.println("Please confirm password");
		confirmedPassword = scan.nextLine();

		if (!(userName.isEmpty() && password.isEmpty())) {

			if (password.length() > 8) {

				if (!password.contains(userName)) {

					if (password.equals(confirmedPassword)) {
						message = "Your Username and Password Has Been Created";
					} else {
						message = "Passwords do not Match";
					}

				} else {
					message = "Password Cannot Contain UserName";
				}

			} else {
				message = "Password is too Short";
			}
		} else {
			message = "Username and Password Cannot be empty";
		}
		System.out.println(message);
	}

}
