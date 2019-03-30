package com.class12;

public class EnhanceLoop2DArray {

	public static void main(String[] args) {
		
		double[][] a = { { 1.4, 2.0, 3.3, 2 }, { 4, 1.5, 6.1, 1 }, { 1.2, 3.1, 4, 1.6 } };

		for (double[] a1 : a) {
			for (double i : a1) {
				System.out.println(i * 2);
			}

		}
	}

}
