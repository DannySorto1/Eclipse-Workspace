package com.class12;

public class GroceryList {

	public static void main(String[] args) {
		String[][] food = { { "Apple", "Grapes", "Berries" }, { "Cucumbers", "Spinach", "Peas" },
				{ "Cheese", "Milk" } };

		for (int i = 0; i < food.length; i++) {

			for (int j = 0; j < food[i].length; j++) {
				System.out.print(food[i][j] + " ");
			}
			System.out.println();
		}
	}
}
