package com.class34;

import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		Map<Integer, Person> person = new HashMap();
		person.put(1, new Person("Tony", "Stark", 40, 350000));

		for (Person detail : person.values()) {
			detail.details();
		}
	}

}
