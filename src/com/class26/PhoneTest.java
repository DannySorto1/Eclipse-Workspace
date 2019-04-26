package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("------Object of Parent Class------");
		Phone cell = new Phone();
		cell.makeCall();
		cell.hasCamera();

		System.out.println("-----Object of Iphone-----");
		iPhone iphone = new iPhone();
		iphone.hasCamera();
		iphone.makeCall();

		System.out.println("------Object of SamSung-----");
		Samsung samsung = new Samsung();
		samsung.makeCall();
		samsung.hasCamera();

		System.out.println("----Object of Nokia-----");
		Nokia nokia = new Nokia();
		nokia.makeCall();
		nokia.hasCamera();

		System.out.println("-----Object of iPhone class referring to the parent------");
		Phone p = new iPhone();
		p.makeCall();
		p.hasCamera();

		System.out.println("-----Object of Nokia class referring to the parent------");

		Phone p1 = new Nokia();
		p1.makeCall();
		p1.hasCamera();

		Phone parentPhone;
		// assinging iphone object
		parentPhone = new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		// assinging samsung object
		parentPhone = new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		// assinging Nokia object
		parentPhone = new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();

	}

}
