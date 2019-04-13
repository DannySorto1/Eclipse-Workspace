package com.class22;

public class TestSyntaxStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SyntaxStudent Stu1 = new SyntaxStudent();
//		Stu1.studentName = "Samir";
//		Stu1.studentLastName = "Aziz";
//		Stu1.StudentInfo();
//
//		SyntaxStudent Stu2 = new SyntaxStudent();
//		Stu1.studentName = "Danny";
//		Stu1.studentLastName = "Sorto";
//		Stu2.StudentInfo();

		SyntaxStudent Stu1 = new SyntaxStudent("Danny", "Sorto");
		Stu1.StudentInfo();

		SyntaxStudent Stu2 = new SyntaxStudent("Charles", "Swag");
		Stu2.StudentInfo();
	}

}
