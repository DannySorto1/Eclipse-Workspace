package com.class27;

public abstract class Phone {
	public void makeCall() {
		System.out.println("Phone can make a call");
	}

	public void sendText() {
		System.out.println("Phone can send text");
	}

	public abstract void unlockPhone();

	public abstract void veiwPictures();

}

class Iphone extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock phone we can use FaceId or FingerPrint");
	}

	@Override
	public void veiwPictures() {
		System.out.println("To view Pictures on Iphone can go to Images");
	}

}

class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To Unlock Samsung we need to enter Password");
	}

	@Override
	public void veiwPictures() {
		System.out.println("To view Pictures on Samsung go to Gallery");
	}

}
