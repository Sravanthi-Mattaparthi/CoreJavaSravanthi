package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		//Approach 1
		put();
		get();
		//Approach 2
		Eg2.put();
		Eg2.get(); 
		//For approach 2 the syntax will be ----> class name followed by dot then method name;
		
	}

	//Static method
	 public static void put() {
		 System.out.println("Put Method");
	 }
	 public static void get() {
		 System.out.println("Get Method");
		 
	 }
	
}

//Key points:
//When your main method is static and you are trying to access the static method there is no need to create a object. 
//Simply mention those method in the main method.