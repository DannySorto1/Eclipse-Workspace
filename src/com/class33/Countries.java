package com.class33;

import java.util.*;

public class Countries {

	public static void main(String[] args) {

		Map<String, String> countries = new HashMap<>();
		countries.put("Usa", "D.C");
		countries.put("El Salvador", "San Salvador");
		countries.put("Spain", "Madrid");
		countries.put("England", "London");
		countries.put("Mexico", "Mexico city");

		System.out.println(countries);
		
		System.out.println("--------------");

		Set<String> Keys = countries.keySet();
		for (String Key : Keys) {
			System.out.println(Key + ":" + countries.get(Key));
		}
		
		System.out.println("----------------");

		Iterator<String> keysIt = Keys.iterator();
		while (keysIt.hasNext()) {
			String Key = keysIt.next();
			System.out.println(Key + ":" + countries.get(Key));

		}
	}

}
