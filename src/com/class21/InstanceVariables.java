package com.class21;

public class InstanceVariables {

	public String name = "John";

	public static void main(String[] args) {

		String name = "Anna";
		System.out.println(name);
		System.out.println("-------Change of local variable----------");
		name = "linda";
		System.out.println(name);

		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);

		System.out.println("-----------Change of instance variable----------");
		obj.name = "jack";
		System.out.println(obj.name);

		System.out.println("--------Second Object----------");
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
	}

	public void hello() {
		System.out.println("Hello " + name);
	}
}
