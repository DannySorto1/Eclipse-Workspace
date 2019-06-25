package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {

		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("James", 800000);
		salaryMap.put("Frank", 90000);
		salaryMap.put("David", 50000);
		salaryMap.put("Jordan", 100000);

		int maxSalary = 0;
		String key = null;

		for (Map.Entry<String, Integer> entry : salaryMap.entrySet()) {
			if (entry.getValue() > maxSalary) {
				maxSalary = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.println(maxSalary + " Belong to " + key);
	}
}
