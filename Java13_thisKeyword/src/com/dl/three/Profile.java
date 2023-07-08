package com.dl.three;

//this() constructor is used to invoke the current class constructor
//this is keyword

public class Profile {
	public Profile() {
		this(10,20);
		System.out.println("Default Constructor");
	}
	
	public Profile(int a) {
		System.out.println(a);
	}
	
	public Profile(int a ,int b) {
		this(100);
		System.out.println(a);
		System.out.println(b);
		
	}
	
public static void main(String args[]) {
	
	new Profile();
	
}
}
	

