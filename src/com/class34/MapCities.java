package com.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapCities {

	public static void main(String[] args) {
		String[] cityMap = { "Paris", "France", "Moscow", "London", "New York", "Washington Dc" };

		Map<Integer, String> nameMap = new TreeMap<>();

		int key = 1;
		for (String cc : cityMap) {
			nameMap.put(key, cc);
			key++;

		}
		System.out.println(nameMap);

		Iterator<Entry<Integer, String>> it = nameMap.entrySet().iterator();
		while(it.hasNext()) {
			if(it.next().getValue().length()>7) {
				it.remove();
			}
		}
		System.out.println(nameMap);
	}

}
