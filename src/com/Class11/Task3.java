package com.Class11;

public class Task3 {

	public static void main(String[] args) {

		String[][] cars = { { "Ford", "Chevy", "Jeep", "GM" }, { "Bmw", "Audi", "VolksWagen", "Mercedes" },
				{ "Fiat", "Ferrari", "Maserati", "Lambo" }, { "Kia", "Hyundai" } };

		for (int row = 0; row < cars.length; row++) {

			for (int col = 0; col < cars[row].length; col++) {
				System.out.print(cars[row][col] + " ");
			}
			System.out.println();
		}
	}

}
