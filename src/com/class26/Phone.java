package com.class26;

public class Phone {
	public void makeCall() {
		System.out.println("Can make a Phone call");
	}

	public void hasCamera() {
		System.out.println("Phone has camera");
	}
}

class iPhone extends Phone {
	public void makeCall() {
		System.out.println("Can make a face time call");
	}

	public void hasCamera() {
		System.out.println("Iphone has daul hd camera");
	}
}

class Nokia extends Phone {
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
}

class Samsung extends Phone {
	public void hasCamera() {
		System.out.println("Samsung phone Has 3 Camera Lens ");
	}
}