package com.class24;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor con = new Contractor();
		emp.getPaid();//Employee gets paid Salary
		ft.getPaid();//Full time Employee gets paid Salary and Bonus
		con.getPaid();
	}

}
