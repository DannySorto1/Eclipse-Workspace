package com.class17_2;

public class NestedLoopDemo {
	public static void main(String[] args) {

		NestedLoopDemo demo = new NestedLoopDemo();
		demo.printNumber();
	}

	void printNumber() {
		for (int x = 1; x < 3; x++) {
			for (int v = 0; v <= 3; v++) {
				System.out.println(x + " " + v);
			}

		}
	}
}
