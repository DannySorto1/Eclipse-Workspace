package com.class27;

public class Task1 {
	String name;
	String Address;

	Task1(String name, String Address) {
		this.name = name;
		this.Address = Address;
	}

	public void displayinfo() {
		System.out.println("Student name " + name + " And address is " + Address);
	}

	public static void main(String[] args) {
		Task1 tt = new Task1("Daniel Sorto", "3404 cali dr l2234");
		tt.displayinfo();

	}
}
