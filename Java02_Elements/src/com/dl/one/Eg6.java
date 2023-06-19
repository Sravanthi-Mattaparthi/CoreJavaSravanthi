package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		new Eg6().m1(); // for return type void of instance method to be used in static method we created the object
		m2();           // for the return type static and the static method been used in static main method there is no need to create object, simply call the method
		System.out.println(new Eg6().m3()); //for return type int of instance method we create object along with output statement in written
		System.out.println(new Eg6().sendRequest());
		

	}
	public void m1() {   //Instance method
		System.out.println("Instance method");
	}
	
	public static void m2() { //Static method
		System.out.println("Static method");
	}
	public int m3() {  // return type is int
		return 0;
	}
	
	public String sendRequest() { // return type is String
		
		return ("Request has been sent");
	}

}
