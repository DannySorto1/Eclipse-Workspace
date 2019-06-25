package com.class33;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Google Store");
		map.put(2, "Apple Store");
		map.put(3, "Footlocker Store");
		map.put(4, "Subway Store");
		map.put(5, "Syntax Store");
		map.put(6, "Nike Store");
		map.put(7, "Gucci Store");

		System.out.println(map.size());
		map.replace(4, "Adidas Store");
		map.remove(7, "Gucci Store");
		System.out.println(map);

	}
}
