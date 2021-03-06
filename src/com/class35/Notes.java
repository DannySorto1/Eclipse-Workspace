package com.class35;

public class Notes {

	public static void main(String[] args) {
//		Class 35
//		Exception - unexpected/unwanted event that distrupts the flow of your program execution.
//
//		The parent of all exception is THROWABLE class:
//		Error - smth we cannot fix
//		Exception - smth that can be handled by a programmer
//
//		Handling an exception doesnt not mean fixing it, we are just providing an alternative way to complete program execution
//
//		Exceptions are 2 types:
//		1. Checked E - checked during compile time that Exception might occur and what would like to do with it. Checked Exception must be handled otherwise your code won't compile.
//
//			Thread.sleep(2000);
//
//		2. Unchecked E - exception that might occur but it is not checked by a compiler. Unchecked E=RunTime E
//
//				int a=10;
//				int b=0;
//				
//				System.out.println(a/b);
//
//		ALL EXCEPTIONS OCCUR ONLY AT RUN-TIME
//
//		There are 2 ways to handle an Exception:
//		1. try and catch block
//
//			In try code we put problematic/ricky code that might throw an exception
//			In catch block we put MATCHING exception type, that will catch/handel that exception
//
//		Try block might have multiple catch block, but  at the time of program execution ONLY ONE catch is getting executed.
//
//		3 ways to print name and details of an exception 
//			1. e.printStackTrace();//name of E, detail of E, location
//			2. System.out.println(e);//name of the E and details
//			3. System.out.println(e.getMessage());//details of an E
//
//		--1 try block and 1 catch block
//		try {
//			some code;
//		}catch (ExceptionClassName var) {
//			var.getMessage();
//		}
//
//		--1 try block and muplitple catch blocks
//		try {
//			some code;
//		}catch (ExceptionClassName var) {
//			var.getMessage();
//		}catch (ExceptionClassName var) {
//			var.getMessage();
//		}
//
//		Finally Block is a optional block of code that is associated with the try block and usually conatins of CLEAN UP code.
//		Finally block ALWAYS gets executed whether Exception occurs or NOT
//		Finally block won't handle the exception.
//		We can have ONLY ONE finally block 
//
//		--1 try block, 1 catch block, 1 finally block
//
//		try {
//			some code;
//		}catch (ExceptionClassName var) {
//			var.getMessage();
//		}finally {
//			clean up code;
//		}
//
//		--1 try block , 1 finally block
//		try {
//			some code;
//		}finally {
//			clean code;
//		}
//		--1 try block , multiple catch blocks, 1 finally block
//		try {
//			some code;
//		}catch (ExceptionClassName var) {
//			var.getMessage();
//		}catch (ExceptionClassName var) {
//			var.getMessage();
//		}finally {
//			clean up code;
//		}
//
//		EXAMPLE:
//				int a = 10;
//				int b = 0;
//				
//				try {
//					System.out.println("Try block code");
//					System.out.println(a / b);
//				} catch (ArithmeticException e) {
//					System.out.println("Catch block code");
//				} finally {
//					System.out.println("Finally block code");
//				}
//
//		IQ: What is the difference b/w FINAL vs FINALLY vs FINALIZE
//
//		Final - KEYWORD that used with 
//			variables - CONSTANT variable cannot change it's value
//			methods - CANNOT OVERRIDE final method
//			class - PREVENTS INHERITANCE
//
//		Finally - BLOCK assosiated with TRY BLOCK
//			The code inside this block ALWAYS gets executed
//
//		Finalize - METHOD assosiated with Garbage Collector Process
//			Garbage Collector Process - is a process of destroying unused object.
//			
//		THROWS Keyword:
//
//		- used to deligate responsibility of Handling an exception to the caller(either different method or JVM)

	}

}
