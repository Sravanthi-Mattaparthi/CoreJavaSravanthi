package com.dl.doublecolon;

public class Eg2 {

	public static void main(String[] args) {

		//Normal Execution
		userDetails("Sai", "Kiran");
		
		//Using Lambda Expression
		Thread t1 = new Thread(()->userDetails("Sai", "Kiran"));
		t1.start();
		
		//using double colon implementation
		//Syntax: ClassName::staticMethodName
		Thread t2 = new Thread(Eg2::caller);
		t2.start();
	}

	// static method
	public static void userDetails(String fName, String lName) {
		System.out.println(fName);
		System.out.println(lName);
	}
	
	public static void caller() {
		userDetails("Sai", "Kumar");
	}
}
