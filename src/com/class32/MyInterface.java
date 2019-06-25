package com.class32;

public interface MyInterface {
	public void Yep();

	public void nerp();

}

class Y implements MyInterface{

	@Override
	public void Yep() {
		System.out.println("implementation of method1");
		
	}

	@Override
	public void nerp() {
		System.out.println("implementation of method2");
		
	}
	
}