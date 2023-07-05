package com.dl.four;


// Constructor overloading
public class Parent {
	public Parent() {
		System.out.println("Default Constructor");
		
	}
	
	public Parent(int i) {   //Constructor 1
		System.out.println(i);
	}
	
	public Parent(int i, int j) {  //Constructor 2
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		new Parent();
		new Parent(10);
		new Parent (20,30);
		
		

	}

}
//KeyPoint
// Constructor name and class name should be same
//constructors names must be same but the arguments should be different 
//For calling constructor into main method , we use "new" followed with constructor method