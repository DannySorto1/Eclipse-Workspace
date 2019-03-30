package com.class12;

public class HW62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };

		int maxNumber = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int b = 0; b < a[i].length; b++) {
				if (a[i][b] > maxNumber) {
					maxNumber = a[i][b];
				}

			}
		}
		System.out.println(maxNumber);
	}

}
