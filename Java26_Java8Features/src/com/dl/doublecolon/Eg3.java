package com.dl.doublecolon;

public class Eg3 {

	public static void main(String[] args) {

		//Normal Way
		new Eg3().userDetails("Sai", "Kiran");
		
		//Syntax: new instance() :: instanceMethodName
		Thread t = new Thread(new Eg3()::caller);
		t.start();
	}

	public void userDetails(String fName, String lName) {

		System.out.println(fName);
		System.out.println(lName);
	}
	
	public void caller() {
		
		new Eg3().userDetails("Sai", "Ram");
	}
}
