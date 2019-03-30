package com.class5;

import java.util.Scanner;

public class FoodNational {
	public static void main(String[] args) {

		Scanner scan;
		String country;
		String food;

		scan = new Scanner(System.in);
		System.out.println("Please enter wich country you are from");
		country = scan.nextLine();

		switch (country) {

		case "USA":
			food = "Burger";
			break;
		case "Afganistan":
			food = "Palau";
			break;
		case "Russia":
			food = "Pelmeni";
			break;
		case "Italy":
			food = "Pasta";
			break;
		case "Turkey":
			food = "Baklava";
			break;
		case "Morocco":
			food = "couscous";
			break;
		case "Kazakhstan":
			food = "Beshparmak";
			break;
		case "Pakistan":
			food = "Biryani";
			break;
		default:
			food = "Unknown";

		}
		System.out.println("Your favorite is " + food);

	}

}
