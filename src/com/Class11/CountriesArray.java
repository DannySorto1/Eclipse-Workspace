package com.Class11;

public class CountriesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Country = { "Usa", "El Salvador", "Mexico", "Brazil" };
		String[] Capitals = { "Washington D.C.", "San Salvador", "Mexico City", "Brasilia" };

		for (int i = 0; i < Country.length; i++) {

			if (Country[i] == Capitals[i]) {

			}
			System.out.println(Country[i] + ":" + Capitals[i]);
		}

	}
}
