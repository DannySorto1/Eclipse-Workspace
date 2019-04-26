package com.ReviewClass7;

public class Employee extends Person {
	int salary;

	public void getPaid() {
		System.out.println(firstName + " " + lastName + " " + age + " " + salary);
	}
}

class Student extends Person {
	int grade;

	public void getGrade() {
		System.out.println(firstName + " " + lastName + " " + age + " " + grade);
	}
}

class Retiree extends Person{
	String seniorActivity;

	public void getInfo() {
		System.out.println(firstName + " " + lastName + " " + age + " " + seniorActivity);
	}
}