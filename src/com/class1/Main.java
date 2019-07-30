package com.class1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Collection<Integer> values = new ArrayList();
		values.add(12);
		values.add(123);
		values.add(1234);
		values.add(1223567);
		values.remove(12);
		System.out.println(values);
	}
}
