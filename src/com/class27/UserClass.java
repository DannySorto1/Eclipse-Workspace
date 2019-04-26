package com.class27;

public class UserClass {
	public String name;
	public int number;

	UserClass(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public static void main(String[] args) {
		UserInfo cc = new UserInfo("Teddy", 703456867, "123 South st");
		cc.userDetails();
	}
}

class UserInfo extends UserClass {
	String Addy;

	UserInfo(String name, int number, String Addy) {
		super(name, number);
		this.Addy = Addy;

	}

	public void userDetails() {
		System.out.println("User name is: " + name + " Number is: " + number + " the address is: " + Addy);
	}

}