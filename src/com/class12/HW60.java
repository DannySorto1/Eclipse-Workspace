package com.class12;

public class HW60 {

	public static void main(String[] args) {
		double[][] a = { { 1.4, 2.0, 3.3, 2 }, { 4, 1.5, 6.1, 1 }, { 1.2, 3.1, 4, 1.6 } };

		for (int i = 0; i < a.length; i++) {

			for (int b = 0; b < a[i].length; b++) {
				System.out.println(a[i][b] * 2);
			}
		}
	}

}
