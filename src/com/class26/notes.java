//package com.class26;
//
//public class notes {
//
//	public static void main(String[] args) {
////		Class 26
//
//		Method Overloading vs Method Overriding
//		Method Overloading - METHOD name is SAME within same class
//		Method Overriding - METHOD name is SAME in parent and child Class
//
//		Differences:
//		1. in Method Overloading parameters MUST be Different while in Method 		Overriding parameters MUST BE the same
//		2. in Method Overloading method signature MUST be DIFFERENT while in 
//			Method Overriding MUST be SAME (name+parameters)
//		3. in Method Overloading return type CAN BE different while in 
//			Method Overriding MUST be SAME
//		4. in Method Overloading WE DO NOT need inheritance while in 
//			Method Overriding Inheritance is MUST.
//		5 We can OVERLOAD STATIC methods, but we CANNOT OVERRIDE static(method 		hiding).
//		6. We can Overload a Constructor while we CANNOT override a constructor
//		7. We can OVERLOAD private method, but we CANNOT override it
//		8. in Method Overloading no resrtiction for access modifiers while in  		Overriding  CANNOT be more restrictive
//		9. Final method CAN BE Overloaded , while final method CANNOT be Overriden
//
//		THIS Keyword:
//		Refers to the current class instance/object
//		this is used to access CURRENT members of the class (variables and methods).
//		this. - used for variables and methods
//		this()  - used with constructor
//
//		this keyword available for non static members
//		1. this with variables -this. is used to differentiate b/w local and instance variables
//		2. this with method - this. refers to the current instance method (if we do not use it by default compiler adds it)
//
//		this() - used to call current class constructor
//					when we have overloaded constructors with can call 1 constructor within another one (known as constructor chaining)
//		this() - should you1 first statement within constructor
//
//		GrandParent --> Parent --> Child --> grandChild
//		Super Keyword: 
//		Refers to the immidiate super class instance/object
//		super.  - for variables and method in parent class
//		super() - for parent class constructor
//
//		1. super with variables  - super.refers to the parent class instance variables (need when we want to differentiate between child and parent variables)
//		2. super with method - super. refers to the parent instance method
//		(accessing overriden method)
//
//		super() - used to call a constructor of a Parent class
//
//
//	}
//
//}
