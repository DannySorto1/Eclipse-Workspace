package com.Class11;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Cars1 = { "Bmw", "Jeep", "Ford", "Dodge", "Chevy", "GMC" };

		System.out.println("-----Loop One------");
		for (int i = 0; i <= Cars1.length - 1; i++) {
			System.out.println(Cars1[i]);

		}
		System.out.println("-------Loop Two------");
		for (String Cars : Cars1) {
			System.out.println(Cars);
		}
	}

}
