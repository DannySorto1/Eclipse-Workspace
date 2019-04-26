package com.class24;

public class StoreProduct {
	String label;
	int price;
	static String category = "misc";
	boolean hasExpiration = false;
	int stock = 0;

	StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);

	}

	StoreProduct(String label, int price, int stock) {
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}

	StoreProduct(String label, int price) {
		category = "null";
		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}
}
