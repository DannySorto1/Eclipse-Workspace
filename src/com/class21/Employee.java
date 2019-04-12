package com.class21;

public class Employee {
	static String ceo = "Sumair";
	int eID;
	int salary;

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.eID = 1234567;
		obj.salary = 500234;
		obj.empInfo();

		Employee obj1 = new Employee();
		obj1.eID = 9876543;
		obj1.salary = 400345;
		obj1.empInfo();
		
	}

	public void empInfo() {
		System.out.println("Employee ID " + eID + " Salary " + salary + " Ceo of the Company " + ceo);
	}
}