package com.class34;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {
	public static void main(String[] args) {
		String[] names = { "Captain America", "Rocket", "Groot", "Tony Stark", "Peter Quil", "Thor", "Hulk", "HawkEye",
				"WarMachine" };

		Map<Integer, String> nameMap = new LinkedHashMap<>();

		int key = 1;

		for (String name : names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
	}
}
