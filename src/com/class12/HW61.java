package com.class12;

public class HW61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 2, 2 }, { 1, 2, 3, 4 } };
		int rowTotal = 0;
		for (int i = 0; i < a.length; i++) {
			rowTotal += a[0][i];
		}
		System.out.println(rowTotal);

	}
}
